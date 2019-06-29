package com.ql.config;

import lombok.Data;

/**
 * @ClassName Config
 * @Description Config
 * @Author stack
 * @Version 1.0
 * @since 2019/6/29 17:27
 */
@Data
public class Config {

    private String timeout;
    private int maxTotal;
    private int maxIdle;
    private int maxWaitMillis;
    private String minEvictableIdleTimeMillis;
    private int numTestsPerEvictionRun;
    private String timeBetweenEvictionRunsMillis;
    private Boolean testOnBorrow;
    private Boolean testWhileIdle;

}
