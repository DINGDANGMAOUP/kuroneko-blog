package com.dingdangmaoup.kb.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 管理应用程序
 *
 * @author dzhao1
 * @date 2022/12/05
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.dingdangmaoup.kb.admin", "com.alibaba.cola"})
public class AdminApplication {

  public static void main(String[] args) {
    SpringApplication.run(AdminApplication.class, args);
  }

}
