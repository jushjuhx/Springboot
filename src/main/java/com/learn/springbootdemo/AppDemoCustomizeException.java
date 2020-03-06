package com.learn.springbootdemo;

import com.learn.springbootdemo.exception.CustomizeExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * 自定义错误时的响应（500错误，非404错误）
 * 实现WebMvcConfigurer接口，并重写configureHandlerExceptionResolvers方法即可
 * <p>
 * <p>
 * 关联代码
 * {@link CustomizeExceptionHandler}
 */
@SpringBootApplication
@RestController
public class AppDemoCustomizeException implements WebMvcConfigurer {


    /**
     * HTTP请求不设置id的情况下，会返回自定义错误信息
     *
     * @param id url参数
     * @return 内容
     */
    @RequestMapping("/*")
    public String query1ById(int id) {
        return "id is :" + id;
    }


    @RequestMapping("/*/*")
    public String query2ById(int id) {
        return "depth 2. id is :" + id;
    }

    @Override
    public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
        resolvers.add(0, new CustomizeExceptionHandler());
    }

    public static void main(String[] args) {
        SpringApplication.run(AppDemoCustomizeException.class, args);
    }

}
