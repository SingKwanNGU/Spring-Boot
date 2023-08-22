package com.atguigu.boot.controller;


import com.atguigu.boot.bean.bean.User;
import com.atguigu.boot.exception.TooManyUsersException;
import com.atguigu.boot.service.UserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

/**
 * @projectName: boot-05-web-admin
 * @package: com.example.admin.controller
 * @className: TableController
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/16 16:52
 * @version: 1.0
 */
@Controller
public class TableController {

    @Autowired
    UserService userService;

    @GetMapping("/basic_table")
    public String basic_table(){
        return "table/basic_table";
    }


    @GetMapping("/dynamic_table/delete/{id}")
    public String deleteById(@PathVariable("id")Long id,
                             @RequestParam(value = "pn",defaultValue = "1")Integer pn,
                             RedirectAttributes ra){
        userService.removeById(id);
        ra.addAttribute("pn",pn);
        return "redirect:/dynamic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1")Integer pn ,
                                Model model){
        //学会表格内容的遍历
//        List<User> users= Arrays.asList(new User("zhangsan","1234"),
//                new User("lisi","123"),
//                new User("wangwu","aaaa"),
//                new User("zhaoliu","bbbb"));
//                model.addAttribute("users",users);
//        if(users.size()>3){
//            throw new TooManyUsersException();
//        }

        //从数据库中查出user表中的数据并进行展示
        List<User> list = userService.list();
//        model.addAttribute("users",list);
        Page<User> userPage = new Page<>(pn, 2);
        Page<User> page = userService.page(userPage, null);
        long current = page.getCurrent();
        long pages = page.getPages();
        long total = page.getTotal();
        List<User> records = page.getRecords();
        model.addAttribute("page",page);
        return "table/dynamic_table";
    }

    @GetMapping("/editable_table")
    public String editable_table(){
        return "table/editable_table";
    }

    @GetMapping("/pricing_table")
    public String pricing_table(){
        return "table/pricing_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "table/responsive_table";
    }
}
