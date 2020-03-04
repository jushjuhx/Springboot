package com.learn.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 添加filter 方案二，
 * 实现Filter接口、注册Filter
 * 关联代码
 * {@link com.learn.springbootdemo.filter.FilterSchemeBConfig}
 * {@link com.learn.springbootdemo.filter.FilterSchemeB1}
 * {@link com.learn.springbootdemo.filter.FilterSchemeB2}
 * <p>
 * 运行时需要注释掉{@link com.learn.springbootdemo.AppDemoAddFilterSchemeA}的"@ServletComponentScan"注解
 */
@SpringBootApplication
public class AppDemoAddFilterSchemeB {

    public static void main(String[] args) {
        SpringApplication.run(AppDemoAddFilterSchemeB.class, args);
    }
}
