package com.ql.servicetest.ConditionalOnBeanDemo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

//    @Bean(name = "notebookPC")
    public Computer computer1() {
        return new Computer("笔记本电脑");
    }

    @ConditionalOnMissingBean(Computer.class)
//    @ConditionalOnBean(Computer.class)
    @Bean("backupNotebookPC")
    public Computer computer2() {
        return new Computer("备用电脑");
    }
}