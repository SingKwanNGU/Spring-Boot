package com.atguigu.hello.auto;

import com.atguigu.hello.bean.HelloProperties;
import com.atguigu.hello.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @projectName: boot-09-customer-starter
 * @package: com.atguigu.hello.auto
 * @className: HelloServiceAutoConfiguration
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/26 16:16
 * @version: 1.0
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {

    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService(){
        HelloService helloService=new HelloService();
        return helloService;
    }

}
