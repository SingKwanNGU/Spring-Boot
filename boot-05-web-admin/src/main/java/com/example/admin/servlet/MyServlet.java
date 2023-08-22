package com.example.admin.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @projectName: boot-05-web-admin
 * @package: com.example.admin.servlet
 * @className: MyServlet
 * @author: SingKwan
 * @description: TODO 学会springboot中注入原生组件（servlets,filters,listeners）
 * @date: 2023/4/20 10:40
 * @version: 1.0
 */
//@WebServlet(urlPatterns = "/my")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("666");
    }
}

