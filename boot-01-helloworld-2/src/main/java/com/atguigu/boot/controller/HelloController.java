package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: boot-01-helloworld-2
 * @package: com.atguigu.boot.controller
 * @className: HelloController
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/5 0:10
 * @version: 1.0
 */
@RestController
public class HelloController {

    @Autowired
    Person person;


    @RequestMapping("/person")
    public Person person(){
        return person;
    }
}
