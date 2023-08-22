package com.example.admin.servlet;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import lombok.extern.slf4j.Slf4j;

/**
 * @projectName: boot-05-web-admin
 * @package: com.example.admin.servlet
 * @className: MyServletContextListener
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/20 11:21
 * @version: 1.0
 */
@Slf4j
//@WebListener
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
//        log.info("MyServletContextListener监听到项目初始化完成");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
//        log.info("MyServletContextListener监听到项目销毁完成");
    }
}
