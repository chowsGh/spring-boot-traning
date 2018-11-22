package com.clydezhou.spring.springboot.demo.ssm.dao;

import org.apache.ibatis.annotations.Mapper;

import com.clydezhou.spring.springboot.demo.ssm.po.UserInfo;

@Mapper
public interface IUserInfoDao {
    UserInfo getById(long id);

    long add(UserInfo userInfo);
}
