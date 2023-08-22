package com.atguigui.boot.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @projectName: boot-09-hello-test
 * @package: com.atguigui.boot.listener
 * @className: MyCommandLineRunner
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/26 23:20
 * @version: 1.0
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner....run....");
    }
}
