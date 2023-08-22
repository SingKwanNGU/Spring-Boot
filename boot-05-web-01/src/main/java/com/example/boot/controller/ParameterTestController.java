package com.example.boot.controller;

import com.example.boot.bean.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: boot-05-web-01
 * @package: com.example.boot.controller
 * @className: ParameterTestController
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/11 14:54
 * @version: 1.0
 */
@RestController
public class ParameterTestController {

    @PostMapping("/saveuser")
    public Person saveuser(Person person){
        return person;
    }

}
