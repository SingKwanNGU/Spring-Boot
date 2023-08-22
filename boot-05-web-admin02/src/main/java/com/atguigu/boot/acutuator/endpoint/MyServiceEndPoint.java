package com.atguigu.boot.acutuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

/**
 * @projectName: boot-05-web-admin02
 * @package: com.atguigu.boot.acutuator.endpoint
 * @className: MyServiceEndPoint
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/25 17:26
 * @version: 1.0
 */
@Component
@Endpoint(id="myservice")
public class MyServiceEndPoint {


    @ReadOperation
    public Map getDockerInfo(){
        return Collections.singletonMap("docker info","docker started...");
    }

    @WriteOperation
    public void stopDocker(){
        System.out.println("docker stopped....");
    }
}
