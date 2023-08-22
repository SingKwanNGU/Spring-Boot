package com.atguigu.boot;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;

@MapperScan("com.atguigu.boot.mapper")
@SpringBootApplication(exclude = RedisAutoConfiguration.class)
public class Boot05WebAdmin02Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot05WebAdmin02Application.class, args);
    }

}
