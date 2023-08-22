package com.atguigu.boot.controller;


import com.atguigu.boot.bean.Book;
import com.atguigu.boot.bean.City;
import com.atguigu.boot.bean.bean.User;
import com.atguigu.boot.service.BookService;
import com.atguigu.boot.service.CityService;
import com.atguigu.boot.service.Impl.BookServiceImpl;
import com.atguigu.boot.service.Impl.CityServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @projectName: boot-05-web-admin
 * @package: com.example.admin.controller
 * @className: IndexController
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/15 22:56
 * @version: 1.0
 */
@Slf4j
@Controller
public class IndexController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    BookService bookService;

    @Autowired
    CityService cityService;

    @ResponseBody
    @PostMapping("/city")
    public City saveCity(City city){
        cityService.saveCity(city);
        return city;
    }

    @ResponseBody
    @GetMapping("/city")
    public City getCityById(@RequestParam("id")Integer id){
       return cityService.getCityById(id);
    }

    @ResponseBody
    @GetMapping("/book")
    public Book getBook(@RequestParam("bookId")Integer bookId){
        return bookService.getBook(bookId);
    }

    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDb(){
        Long aLong=jdbcTemplate.queryForObject("select count(*) from t_book",long.class);
        return aLong.toString();
    }

    /**
     * @param :
     * @return String
     * @author perse
     * @description TODO 访问"/"和”/login“会转发到login.html进行登录
     * @date 2023/4/15 22:58
     */
    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        //如果有账号密码，才可以登录
        if(StringUtils.hasText(user.getUserName()) && StringUtils.hasLength(user.getPassword())){
            //保存当前登录用户到session中
            session.setAttribute("loginUser",user);
            return "redirect:main.html";

        }else {
            //无账号密码，返回登录页面
            model.addAttribute("msg","账号密码错误");
            return "login";
        }
        //为了避免刷新会重复提交表单进行此登录方法，这里将返回main.html让其重新请求main页面，
        // 这样请求路径会变成main.html，刷新也是重复请求main页面，不会再重新提交表单，才是真正意义上的登录成功。

    }


    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model){
        log.info("当前方法是：{}","mainPage");
        return "main";

    }

}
