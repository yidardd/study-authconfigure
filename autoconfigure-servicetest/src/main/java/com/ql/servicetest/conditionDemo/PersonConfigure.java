package com.ql.servicetest.conditionDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName PersonConfigure @Description PersonConfigure @Author stack @Version 1.0
 *
 * @since 2019/6/27 17:34
 */
@Configuration
@Conditional({FalseCondition.class})
public class PersonConfigure {

  @Bean(name = "bill")
  @Conditional({FalseCondition.class})
  public Person person1() {
    return new Person("----false-----", 62);
  }

  @Bean("linus")
  @Conditional({TrueCondition.class})
  public Person person2() {
    return new Person("-----true----", 48);
  }
}
