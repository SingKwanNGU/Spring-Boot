package com.atguigui.boot.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @projectName: boot-09-hello-test
 * @package: com.atguigui.boot.listener
 * @className: MyApplicationListener
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/26 23:13
 * @version: 1.0
 */
public class MyApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("MyApplicationListener....onApplicationEvent...");
    }
}
