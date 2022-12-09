package com.dingdangmaoup.kb.admin.infrastructure.service.impl;

import com.alibaba.cola.catchlog.CatchAndLog;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dingdangmaoup.kb.admin.domain.model.domain.KbTenant;
import com.dingdangmaoup.kb.admin.infrastructure.service.KbTenantService;
import com.dingdangmaoup.kb.admin.infrastructure.mapper.KbTenantMapper;
import org.springframework.stereotype.Service;

/**
* @author dzhao1
* @description 针对表【kb_tenant(租户表)】的数据库操作Service实现
* @createDate 2022-12-09 15:23:13
*/
@Service
public class KbTenantServiceImpl extends ServiceImpl<KbTenantMapper, KbTenant>
    implements KbTenantService{

}




