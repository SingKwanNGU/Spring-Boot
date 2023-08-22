package com.atguigu.boot.bean;

import lombok.Data;

/**
 * @projectName: boot-05-web-admin02
 * @package: com.atguigu.boot.bean
 * @className: City
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/22 23:23
 * @version: 1.0
 */
@Data
public class City {
    private Long id;
    private String name;
    private String state;
    private String country;
}
