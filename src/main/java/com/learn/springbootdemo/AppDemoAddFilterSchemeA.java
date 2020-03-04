package com.learn.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 添加filter 方案一，需要加@ServletComponentScan注解。
 * 这个注解的作用就是去扫描@WebServlet、@WebFilter、@WebListener这类特殊注解。如果不加，spring容器是不会主动扫描的
 * <p>
 * 多个Filter的执行顺序，说出来你可能不信，这种注解方式实现的Filter是通过Filter的类名首字母来控制执行顺序的，
 * 像Filter1_Filter就比Filter2_Filter先执行。
 * 但网上一些资料说，当Filter数量很多时，是没有明确的执行顺序的，所以不推荐这种方式
 * <p>
 * 关联代码
 * {@link com.learn.springbootdemo.filter.FilterSchemeA1}
 * {@link com.learn.springbootdemo.filter.FilterSchemeA2}
 */
@SpringBootApplication
//@ServletComponentScan
public class AppDemoAddFilterSchemeA {

    public static void main(String[] args) {
        SpringApplication.run(AppDemoAddFilterSchemeA.class, args);
    }
}
