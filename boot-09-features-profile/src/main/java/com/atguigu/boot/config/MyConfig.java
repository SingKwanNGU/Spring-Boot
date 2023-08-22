package com.atguigu.boot.config;

import com.atguigu.boot.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @projectName: boot-09-features-profile
 * @package: com.atguigu.boot.config
 * @className: MyConfig
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/25 21:30
 * @version: 1.0
 */
@Configuration
public class MyConfig {

    @Profile("prod")
    @Bean
    public Color red(){
        return  new Color();
    }

    @Profile("test")
    @Bean
    public Color green(){
        return  new Color();
    }
}
