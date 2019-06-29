package com.ql;

import com.alibaba.fastjson.JSON;
import com.ql.config.RedisProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AutoconfigureWebApplication.class)
public class AutoconfigureWebApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private RedisProperties redisProperties;

	@Test
	public void test1() {

		System.out.println(JSON.toJSONString(redisProperties));

	}
}
