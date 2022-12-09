package com.dingdangmaoup.kb.admin.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dingdangmaoup.kb.admin.domain.model.domain.KbUser;
import com.dingdangmaoup.kb.admin.infrastructure.service.KbUserService;
import com.dingdangmaoup.kb.admin.infrastructure.mapper.KbUserMapper;
import org.springframework.stereotype.Service;

/**
* @author dzhao1
* @description 针对表【kb_user(用户表)】的数据库操作Service实现
* @createDate 2022-12-09 15:22:27
*/
@Service
public class KbUserServiceImpl extends ServiceImpl<KbUserMapper, KbUser>
    implements KbUserService{

}




