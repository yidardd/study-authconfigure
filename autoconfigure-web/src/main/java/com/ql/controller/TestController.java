package com.ql.controller;

import com.ql.servicetest.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TestController
 * @Author stack
 * @Version 1.0
 * @since 2019/6/26 22:31
 */
@RestController
public class TestController {

    @Autowired
    private ServiceTest serviceTest;

    @Autowired
    private RedisTemplate redisTemplate;


    @GetMapping("/")
    public String whoani() {
        return serviceTest.whoami();
    }

    @GetMapping("/redis")
    public String redis() {
        redisTemplate.opsForValue().set("aaa","aaa");
        return (String) redisTemplate.opsForValue().get("aaa");
    }

}
