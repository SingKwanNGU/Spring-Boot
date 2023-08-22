package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: springboot-helloworld
 * @package: com.atguigu.boot.controller
 * @className: HelloController
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/4 14:59
 * @version: 1.0
 */
@RestController
public class HelloController {
    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello!Spring Boot 2！";
    }
}
