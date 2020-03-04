package com.learn.springbootdemo.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterSchemeBConfig {

    @Bean
    public FilterRegistrationBean setFilter0() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new FilterSchemeB0());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setOrder(1);   //order的数值越小，在所有的filter中优先级越高
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean setFilter1() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new FilterSchemeB1());
        filterRegistrationBean.addUrlPatterns("/url1/*");
        filterRegistrationBean.setOrder(2);   //order的数值越小，在所有的filter中优先级越高
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean setFilter2() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new FilterSchemeB2());
        filterRegistrationBean.addUrlPatterns("/url2/*");
        filterRegistrationBean.setOrder(3);   //order的数值越小，在所有的filter中优先级越高
        return filterRegistrationBean;
    }

}