package com.ql.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @ClassName RedisProperties @Description RedisProperties @Author stack @Version 1.0
 *
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
