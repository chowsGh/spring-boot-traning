package com.clydezhou.spring.springboot.demo.ssm.service;

import java.util.List;

import com.clydezhou.spring.springboot.demo.ssm.po.UserInfo;

public interface IUserService {
    UserInfo getById(long id);

    List<UserInfo> getList();

    void addUser(UserInfo user);
}
