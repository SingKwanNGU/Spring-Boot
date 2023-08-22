package com.example.admin.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @projectName: boot-05-web-admin
 * @package: com.example.admin.servlet
 * @className: MyRegistConfig
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/20 11:27
 * @version: 1.0
 */
//默认proxyBeanMethods为true方便保持组件的单实例。毕竟组件之间有依赖关系。
//@Configuration(proxyBeanMethods = true)
public class MyRegistConfig {
    @Bean
    public ServletRegistrationBean myServlet(){
        MyServlet myServlet=new MyServlet();

        return new ServletRegistrationBean<>(myServlet,"/my");
    }

    @Bean
    public FilterRegistrationBean myFilter(){
        MyFilter myFilter=new MyFilter();

//        return new FilterRegistrationBean<>(myFilter,myServlet());
        FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean<>(myFilter);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/my","/css/*"));
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener(){
        MyServletContextListener myServletContextListener=new MyServletContextListener();
        return new ServletListenerRegistrationBean<>(myServletContextListener);
    }
}
