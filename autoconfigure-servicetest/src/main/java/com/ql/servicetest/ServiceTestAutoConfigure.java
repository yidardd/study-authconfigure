package com.ql.servicetest;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ServiceTestAutoConfigure @Description ServiceTestAutoConfigure @Author stack @Version
 * 1.0
 *
 * @since 2019/6/26 22:26
 */
@Configuration
@ConditionalOnClass(ServiceTest.class)
public class ServiceTestAutoConfigure {

  @Bean
  @ConditionalOnMissingBean(ServiceTest.class)
  public ServiceTest serviceTest() {
    ServiceTest helloService = new ServiceTest();
    return helloService;
  }
}
