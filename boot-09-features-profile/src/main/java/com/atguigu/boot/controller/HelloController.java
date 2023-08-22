package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: boot-09-features-profile
 * @package: com.atguigu.boot.controller
 * @className: HelloController
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/25 20:50
 * @version: 1.0
 */
@RestController
public class HelloController {
    @Value("${person.name:李四}")
    private String name;

    @Autowired
    private Person person;


    @GetMapping("/")
    public String hello(){
        return person.getClass().toString();
    }

    @GetMapping("/person")
    public Person person(){
        return person;
    }
}
