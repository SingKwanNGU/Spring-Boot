package com.atguigu.boot.config;


import com.atguigu.boot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @projectName: boot-05-web-admin
 * @package: com.example.admin.config
 * @className: AdminWebConfig
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/17 21:50
 * @version: 1.0
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**").//所有请求都会拦截，静态资源也会被拦截。。。
                excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**,/druid,/druid/*,/druid/**,/city");//只有这两条路径不被拦截
    }
}
