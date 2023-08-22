package com.atguigui.boot.config;

import com.atguigu.hello.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @projectName: boot-09-hello-test
 * @package: com.atguigui.boot.config
 * @className: MyConfig
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/26 17:25
 * @version: 1.0
 */
@Configuration
public class MyConfig {

    @Bean
    public HelloService helloService(){
        HelloService helloService=new HelloService();
        return helloService;
    }
}
