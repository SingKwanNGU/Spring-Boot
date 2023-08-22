package com.atguigu.boot.config;

import com.atguigu.boot.bean.Car;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @projectName: springboot-helloworld
 * @package: com.atguigu.boot.config
 * @className: Myconfig
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/4 17:18
 * @version: 1.0
 */
@Configuration//告诉springboot这是一个配置类,配置类本身也是组件，也是单实例的。
// 该实例由@Configuration的proxyBeanMethods属性使用cglib代理生成的增强代理对象实例，是单实例的
// 这个代理对象他给容器所添加的组件也是单实例的，如果想创建多实例的话，必须将proxyBeanMethods属性改为false.
//Full(proxyBeanMethods=true)如果添加的组件之间有依赖，就使用Full模式，保持组件单实例，获取的对象都是容器中的对象
//Lite(proxyBeanMethods=false)如果添加的组件之无依赖，就是用Lite模式，启动会更快，减少判断
@EnableConfigurationProperties(Car.class)
public class Myconfig {
//    @ConditionalOnBean(name = "tomcat")
    @Bean//给容器添加组件。以方法名作为组件的id.返回的类型就是组件的类型。返回值就是组件在容器中的实例。（单实例）
    public User user01(){
        return new User("zhangsan",18);
    }

//    @Bean
    public Pet tomcat(){
        return new Pet("tomcat");
    }



}
