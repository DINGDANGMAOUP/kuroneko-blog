package com.dingdangmaoup.kb.admin;

import com.alibaba.cola.catchlog.CatchLogAspect;
import com.alibaba.cola.domain.ApplicationContextHelper;
import com.alibaba.cola.domain.DomainFactory;
import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.mybatisplus.extension.toolkit.ChainWrappers;
import java.time.LocalDate;
import javax.sql.DataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import({ApplicationContextHelper.class})
class ApplicationTests {


  @Autowired
  CatchLogAspect catchAndLog;

      @Autowired
    private DataSource dataSource;



  @Test
  void contextLoads() {
       DynamicRoutingDataSource ds = (DynamicRoutingDataSource) dataSource;
    System.out.println(ds.getDataSources().keySet());
  }
}
