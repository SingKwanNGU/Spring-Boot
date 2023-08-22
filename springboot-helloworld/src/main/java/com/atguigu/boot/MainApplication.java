package com.atguigu.boot;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.config.Myconfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @projectName: springboot-helloworld
 * @package: com.atguigu.boot
 * @className: MainApplication
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/4 14:53
 * @version: 1.0
 * 主程序类
 * 使用@SpringBootApplication告诉springboot这是一个springboot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run=SpringApplication.run(MainApplication.class,args);

        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

//        Pet tom01=run.getBean("tomcat",Pet.class);
//        Pet tom02=run.getBean("tomcat",Pet.class);
//        System.out.println("组件:"+(tom01 == tom02));
//
//
//        Myconfig bean=run.getBean(Myconfig.class);
//        System.out.println(bean);
//
//        User user = bean.user01();
//        User user1=bean.user01();
//        System.out.println(user == user1);

        boolean tomcat = run.containsBean("tomcat");
        System.out.println("容器中tomcat组件："+tomcat);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中user01组件："+user01);
    }


}
