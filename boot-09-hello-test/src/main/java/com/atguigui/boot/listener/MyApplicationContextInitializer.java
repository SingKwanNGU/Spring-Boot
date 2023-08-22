package com.atguigui.boot.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @projectName: boot-09-hello-test
 * @package: com.atguigui.boot.listener
 * @className: MyApplicationContextInitializer
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/26 23:12
 * @version: 1.0
 */
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("MyApplicationContextInitializer......initialize...");
    }
}
