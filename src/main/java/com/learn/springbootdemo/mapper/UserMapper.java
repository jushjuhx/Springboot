package com.learn.springbootdemo.mapper;

import com.learn.springbootdemo.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from user where id = #{id}")
    User queryUserById(@Param(value = "id") int id);
}