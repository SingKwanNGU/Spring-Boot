package com.example.boot.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: boot-05-web-01
 * @package: com.example.boot.controller
 * @className: RequestController
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/6 17:33
 * @version: 1.0
 */
@Controller
public class RequestController {

    @GetMapping("/params")
    public String testParams(Map<String,Object>map,
                             Model model,
                             HttpServletRequest request,
                             HttpServletResponse response){
        map.put("hello","world666");
        model.addAttribute("world","hello666");
        request.setAttribute("message","HelloWorld");

        Cookie cookie=new Cookie("c1","v1");
        response.addCookie(cookie);
        return "forward:/success";
    }

    @ResponseBody
    @GetMapping("/success")
    public  Map success(@RequestAttribute(value = "msg",required = false)String msg,
                        @RequestAttribute(value = "code",required = false)Integer code,
                        HttpServletRequest request){
        Object msg1=request.getAttribute("msg");
        Map<String,Object> map=new HashMap<>();
        Object hello = request.getAttribute("hello");
        Object world = request.getAttribute("world");
        Object message = request.getAttribute("message");



        map.put("reqMethod_msg",msg1);
        map.put("annotation_msg",msg);
        map.put("hello",hello);
        map.put("world",world);
        map.put("message",message);
        return map;
    }

}
