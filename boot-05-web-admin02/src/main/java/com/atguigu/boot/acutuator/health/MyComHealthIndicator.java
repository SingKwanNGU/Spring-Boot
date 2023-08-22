package com.atguigu.boot.acutuator.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: boot-05-web-admin02
 * @package: com.atguigu.boot.health
 * @className: MyComHealthIndicator
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/25 15:57
 * @version: 1.0
 */
@Component
public class MyComHealthIndicator extends AbstractHealthIndicator {

    /**
     * @param builder:
     * @return void
     * @author perse
     * @description TODO 编写真实的健康检查方法
     * @date 2023/4/25 15:58
     */
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        Map<String,Object> map=new HashMap<>();
        if(1 == 1){
            builder.status(Status.UP);
            map.put("count",1);
            map.put("ms",100);
        }else {
            builder.status(Status.OUT_OF_SERVICE);
            map.put("err","连接超时");
            map.put("ms",3000);
        }
        builder.withDetail("code",100).withDetails(map);
    }
}
