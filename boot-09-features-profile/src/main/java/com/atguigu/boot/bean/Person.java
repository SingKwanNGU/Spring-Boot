package com.atguigu.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @projectName: boot-09-features-profile
 * @package: com.atguigu.boot.bean
 * @className: Person
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/25 21:19
 * @version: 1.0
 */

public interface Person {
    String getName();
    Integer getAge();
}
