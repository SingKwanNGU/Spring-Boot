package com.atguigu.hello.service;

import com.atguigu.hello.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @projectName: boot-09-customer-starter
 * @package: com.atguigu.hello.service
 * @className: HelloService
 * @author: SingKwan
 * @description: TODO 默认不要放在容器中，
 * @date: 2023/4/26 16:06
 * @version: 1.0
 */
public class HelloService {
    @Autowired
    HelloProperties helloProperties;

    public String sayHello(String userName){
        return helloProperties.getPrefix()+":"+userName+"》"+helloProperties.getSuffix();
    }

}
