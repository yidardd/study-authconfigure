package com.ql.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @ClassName ServiceTestAutoConfigure
 * @Description ServiceTestAutoConfigure
 * @Author stack
 * @Version 1.0
 * @since 2019/6/26 22:26
 */
@Configuration
@ConditionalOnClass(RedisProperties.class)
@EnableConfigurationProperties(RedisProperties.class)
public class RedisTestAutoConfigure {

    @Autowired
    private RedisProperties redisProperties;

    @Bean
    @ConditionalOnMissingBean(RedisConnectionFactory.class)
    public RedisConnectionFactory taskConnectionFactory() {
        JedisConnectionFactory connectionFactory = new JedisConnectionFactory();
        connectionFactory.setPort(redisProperties.getPort());
        connectionFactory.setHostName(redisProperties.getHost());
        connectionFactory.setDatabase(redisProperties.getDb());
        connectionFactory.setPassword(redisProperties.getPass());

        //配置连接池属性
        connectionFactory.setTimeout(Integer.parseInt(redisProperties.getConfig().getTimeout()));
        connectionFactory.getPoolConfig().setMaxIdle(redisProperties.getConfig().getMaxIdle());
        connectionFactory.getPoolConfig().setMaxTotal(redisProperties.getConfig().getMaxTotal());
        connectionFactory.getPoolConfig().setMaxWaitMillis(redisProperties.getConfig().getMaxWaitMillis());
        connectionFactory.getPoolConfig().setMinEvictableIdleTimeMillis(Integer.parseInt(redisProperties.getConfig().getMinEvictableIdleTimeMillis()));
        connectionFactory.getPoolConfig().setNumTestsPerEvictionRun(redisProperties.getConfig().getNumTestsPerEvictionRun());
        connectionFactory.getPoolConfig().setTimeBetweenEvictionRunsMillis(Integer.parseInt(redisProperties.getConfig().getTimeBetweenEvictionRunsMillis()));
        connectionFactory.getPoolConfig().setTestOnBorrow(redisProperties.getConfig().getTestOnBorrow());
        connectionFactory.getPoolConfig().setTestWhileIdle(redisProperties.getConfig().getTestWhileIdle());

        return connectionFactory;
    }

    @Bean
    @ConditionalOnMissingBean(name = "redisTemplate")
    public RedisTemplate redisTemplate() {
        RedisTemplate template = new StringRedisTemplate();
        template.setConnectionFactory(taskConnectionFactory());
        return template;
    }

    @Bean
    @ConditionalOnMissingBean(StringRedisTemplate.class)
    public StringRedisTemplate stringRedisTemplate() {
        StringRedisTemplate template = new StringRedisTemplate();
        template.setConnectionFactory(taskConnectionFactory());
        return template;
    }

}
