package com.clydezhou.spring.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 使用 @Mapper注解到dao接口上也可以
/*
 * @MapperScan({"com.clydezhou.spring.springboot.demo.ssm.dao",
 * "com.clydezhou.spring.springboot.demo.ssm.mapper.UserMapper"})
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
