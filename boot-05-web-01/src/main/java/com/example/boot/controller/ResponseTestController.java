package com.example.boot.controller;

import com.example.boot.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @projectName: boot-05-web-01
 * @package: com.example.boot.controller
 * @className: ResponseTestController
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/12 23:18
 * @version: 1.0
 */
@Controller
public class ResponseTestController {
    /**
     * @param :
     * @return Person
     * @author perse
     * @description 1.浏览器发请求直接返回xml 2.如果是ajax请求，返回json 3.如果硅谷app发请求，返回自定义协议数据
     * @date 2023/4/14 17:29
     */
    @ResponseBody
    @GetMapping("/test/person")
    public Person getPerson(){
        Person person=new Person();
        person.setUserName("zhangsan");
        person.setAge(28);
        person.setBirth(new Date());
        return person;
    }

}
