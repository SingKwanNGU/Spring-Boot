package com.atguigu.boot.bean;

/**
 * @projectName: springboot-helloworld
 * @package: com.atguigu.boot.bean
 * @className: Pet
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/4 17:13
 * @version: 1.0
 */
public class Pet {
    private String name;

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
