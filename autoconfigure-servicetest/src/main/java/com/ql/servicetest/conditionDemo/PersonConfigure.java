package com.ql.servicetest.conditionDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * @ClassName PersonConfigure
 * @Description PersonConfigure
 * @Author stack
 * @Version 1.0
 * @since 2019/6/27 17:34
 */
@Configuration
public class PersonConfigure {

    @Bean(name = "bill")
    @Conditional({WindowsCondition.class})
    public Person person1(){
        return new Person("Bill Gates",62);
    }

    @Bean("linus")
    @Conditional({LinuxCondition.class})
    public Person person2(){
        return new Person("Linus",48);
    }


}
