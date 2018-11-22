package com.clydezhou.spring.springboot.demo.ssm.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.clydezhou.spring.springboot.demo.ssm.mapper.UserMapper;
import com.clydezhou.spring.springboot.demo.ssm.po.UserInfo;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class UserServiceImpl {
    @Resource
    UserMapper userMapper;

    public UserInfo getById(long id) {
        UserInfo user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    public void addUser(UserInfo user) {
        userMapper.insertSelective(user);
    }

    public List<UserInfo> getListFromBirthday(Date start, Date end) {
        Example e = new Example(UserInfo.class);
        Criteria criteria = e.createCriteria();
        if (start != null) {
            criteria.andGreaterThan("birthday", start);
        }
        if (end != null) {
            criteria.andLessThan("birthday", end);
        }
        return userMapper.selectByExample(e);
    }
}
