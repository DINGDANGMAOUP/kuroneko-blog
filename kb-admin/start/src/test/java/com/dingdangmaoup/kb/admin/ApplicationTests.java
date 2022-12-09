package com.dingdangmaoup.kb.admin;

import com.alibaba.cola.catchlog.CatchLogAspect;
import com.alibaba.cola.domain.ApplicationContextHelper;
import com.alibaba.cola.domain.DomainFactory;
import com.baomidou.mybatisplus.extension.toolkit.ChainWrappers;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import({ApplicationContextHelper.class})
class ApplicationTests {


  @Autowired
  CatchLogAspect catchAndLog;

  @Test
  void contextLoads() {

  }
}
