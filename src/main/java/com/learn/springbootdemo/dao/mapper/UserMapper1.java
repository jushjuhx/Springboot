package com.learn.springbootdemo.dao.mapper;

import com.learn.springbootdemo.dao.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 使用注解方式
 */
//@Mapper //在SpringbootdemoApplication中加上注解MapperScan指向该package就不用加该Mapper注解了。
public interface UserMapper1 {
    @Select("select * from user where id = #{id}")
    User queryUserById(@Param(value = "id") int id);
}