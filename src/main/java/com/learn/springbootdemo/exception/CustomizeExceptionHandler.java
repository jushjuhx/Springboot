package com.learn.springbootdemo.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义异常返回信息
 */
public class CustomizeExceptionHandler implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
        String msg = ex.getMessage();

        try {
            response.addHeader("Content-Type", "text/html; charset=UTF-8");
            response.getWriter().append("自定义异常处理!!! \n").append(msg).flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
