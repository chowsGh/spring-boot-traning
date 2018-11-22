package com.clydezhou.spring.springboot.demo.ssm.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.clydezhou.spring.springboot.demo.ssm.dao.IUserInfoDao;
import com.clydezhou.spring.springboot.demo.ssm.po.UserInfo;
import com.clydezhou.spring.springboot.demo.ssm.service.impl.UserServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    UserServiceImpl userService;

    @GetMapping("/list")
    public String userList(@RequestParam(value = "name", required = false) String name, Model model)
        throws ParseException {
        log.info("{} visit.", name);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = sdf.parse("2018-11-22 00:00:00");
        Date end = sdf.parse("2018-11-24 00:00:00");
        model.addAttribute("users", userService.getListFromBirthday(start, end));
        return "users";
    }

    @Resource
    IUserInfoDao userInfoDao;

    @GetMapping("/mybatis")
    public String addUser(Model model) throws ParseException {
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(18);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start = sdf.parse("2018-11-22 01:00:00");
        userInfo.setBirthday(start);
        userInfo.setName("测试");
        userInfo.setLastname("测试名称");
        userInfoDao.add(userInfo);
        model.addAttribute("users", Arrays.asList(userInfo));
        return "users";
    }
}
