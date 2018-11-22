package com.clydezhou.spring.springboot.demo.ssm.rest.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clydezhou.spring.springboot.demo.ssm.po.UserInfo;
import com.clydezhou.spring.springboot.demo.ssm.service.impl.UserServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class IndexController {

    @Resource
    private UserServiceImpl userService;

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public Object hello() {
        UserInfo user = new UserInfo();
        user.setBirthday(new Date());
        user.setAge(20);
        user.setLastname("zhou");
        user.setName("bofan");
        userService.addUser(user);
        log.info(user + ", hello");
        log.info(new Date().toString());
        return user;
    }
}
