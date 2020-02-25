package com.learn.springbootdemo.bean;

import lombok.Getter;
import lombok.Setter;


public class User {
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private Integer age;
}