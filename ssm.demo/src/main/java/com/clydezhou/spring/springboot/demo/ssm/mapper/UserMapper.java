package com.clydezhou.spring.springboot.demo.ssm.mapper;

import com.clydezhou.spring.springboot.demo.ssm.po.UserInfo;

import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<UserInfo> {}
