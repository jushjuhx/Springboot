package com.learn.springbootdemo.controller;

import com.learn.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired(required = false)
    private UserMapper userMapper;

    @RequestMapping("/query")
    public Object queryById(int id) {
        return userMapper.queryUserById(id);
    }

}