package com.dingdangmaoup.kb.admin.infrastructure.config;

import com.baomidou.dynamic.datasource.plugin.MasterSlaveAutoRoutingPlugin;

import static com.dingdangmaoup.kb.admin.infrastructure.constant.PkConstant.*;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.handler.TenantLineHandler;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.TenantLineInnerInterceptor;
import com.dingdangmaoup.kb.admin.infrastructure.handler.TenantLineHandlerImpl;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.LongValue;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis +配置
 *
 * @author dzhao1
 * @date 2022/12/07
 */
@MapperScans({
    @MapperScan(MAPPER)
})
@Configuration
public class MybatisPlusConfig {

  @Bean
  public MasterSlaveAutoRoutingPlugin masterSlaveAutoRoutingPlugin() {
    return new MasterSlaveAutoRoutingPlugin();
  }

  /**
   * 新的分页插件,一缓和二缓遵循mybatis的规则,需要设置 MybatisConfiguration#useDeprecatedExecutor = false
   * 避免缓存出现问题(该属性会在旧插件移除后一同移除)
   */
  @Bean
  public MybatisPlusInterceptor mybatisPlusInterceptor() {
    MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
    //分页
    interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
    //多住户
    interceptor.addInnerInterceptor(new TenantLineInnerInterceptor(new TenantLineHandlerImpl()));
    //乐观锁
    interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
    //防止全表更新与删除
    interceptor.addInnerInterceptor(new BlockAttackInnerInterceptor());
    return interceptor;
  }


}
