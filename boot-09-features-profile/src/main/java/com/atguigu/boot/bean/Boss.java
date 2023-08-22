package com.atguigu.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @projectName: boot-09-features-profile
 * @package: com.atguigu.boot.bean
 * @className: Boss
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/25 21:25
 * @version: 1.0
 */
@Profile("prof")
@Component
@ConfigurationProperties("person")
@Data
public class Boss implements Person{
    private String name;
    private Integer age;


}
