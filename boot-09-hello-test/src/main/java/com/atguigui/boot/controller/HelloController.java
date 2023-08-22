package com.atguigui.boot.controller;

import com.atguigu.hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: boot-09-hello-test
 * @package: com.atguigui.boot.controller
 * @className: HelloController
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/26 0:13
 * @version: 1.0
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String sayHello(){
        String s = helloService.sayHello("张三");
        return s;
    }


}
