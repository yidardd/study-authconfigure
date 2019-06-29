package com.ql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 东东 on 2018/10/28.
 */
@SpringBootApplication
public class RunApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(RunApplication.class);
        springApplication.run(args);
    }

}
