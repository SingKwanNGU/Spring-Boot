package com.atguigui.boot.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @projectName: boot-09-hello-test
 * @package: com.atguigui.boot.listener
 * @className: MyApplicationRunner
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/26 23:19
 * @version: 1.0
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("MyApplicationRunner....run...");
    }
}
