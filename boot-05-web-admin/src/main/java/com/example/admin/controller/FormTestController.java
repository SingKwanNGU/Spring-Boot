package com.example.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @projectName: boot-05-web-admin
 * @package: com.example.admin.controller
 * @className: FormTestController
 * @author: SingKwan
 * @description: TODO 实现文件上传功能
 * @date: 2023/4/17 23:52
 * @version: 1.0
 */
@Slf4j
@Controller
public class FormTestController {

    @GetMapping("/form_layouts")
    public String form_layouts(@RequestParam("a")int a){
        return "form/form_layouts";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("email")String email,
                         @RequestParam("username")String username,
                         @RequestPart("headerImg")MultipartFile headerImg,
                         @RequestPart("photos")MultipartFile[] photos){
        log.info("上传的信息：email={},username={},headerImg={},photos={}",
                email,username,headerImg.getSize(),photos.length);
        return "main";
    }


}
