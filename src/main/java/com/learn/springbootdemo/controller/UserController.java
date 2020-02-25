package com.learn.springbootdemo.controller;

import com.learn.springbootdemo.bean.User;
import com.learn.springbootdemo.dao.UserMapper1;
import com.learn.springbootdemo.dao.UserMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired(required = false) //Autowired可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。
    private UserMapper1 userMapper1;

    @Autowired(required = false)
    private UserMapper2 userMapper2;

    @RequestMapping("/query1")
    public User query1ById(int id) {
        return userMapper1.queryUserById(id);
    }

    @RequestMapping("/query2")
    public User query2ById(int id) {
        return userMapper2.searchX(id);
    }

}