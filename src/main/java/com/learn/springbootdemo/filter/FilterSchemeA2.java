package com.learn.springbootdemo.filter;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "filter2", urlPatterns = {"/url2/*"})
public class FilterSchemeA2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("do filter scheme a 2");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }

}