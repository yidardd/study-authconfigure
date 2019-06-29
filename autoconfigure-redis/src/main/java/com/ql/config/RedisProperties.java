package com.ql.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName RedisProperties
 * @Description RedisProperties
 * @Author stack
 * @Version 1.0
 * @since 2019/6/29 17:20
 */
@ConfigurationProperties("redis.task")
@Data
@Component
public class RedisProperties {

    private String host;

    private int port;

    private String pass;

    private int db;

    private Config config;

}
