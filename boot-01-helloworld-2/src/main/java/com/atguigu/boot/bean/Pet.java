package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @projectName: boot-01-helloworld-2
 * @package: com.atguigu.boot.bean
 * @className: Pet
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/4 23:47
 * @version: 1.0
 */
@ToString
@Data
public class Pet {
    private String name;
    private Double weight;
}
