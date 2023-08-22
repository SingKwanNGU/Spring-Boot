package com.example.admin.controller;

import com.example.admin.bean.User;
import com.example.admin.exception.TooManyUsersException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/basic_table")
    public String basic_table(){
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model){
        //学会表格内容的遍历
        List<User> users= Arrays.asList(new User("zhangsan","1234"),
                new User("lisi","123"),
                new User("wangwu","aaaa"),
                new User("zhaoliu","bbbb"));
                model.addAttribute("users",users);
        if(users.size()>3){
            throw new TooManyUsersException();
        }

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
