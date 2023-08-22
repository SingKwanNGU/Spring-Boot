package com.example.boot.bean;

import lombok.Data;

import java.util.Date;

/**
 * @projectName: boot-05-web-01
 * @package: com.example.boot.bean
 * @className: Person
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/11 15:02
 * @version: 1.0
 */
@Data
public class Person {
    private String userName;
    private Integer age;
    private Date birth;
    private Pet pet;
}
