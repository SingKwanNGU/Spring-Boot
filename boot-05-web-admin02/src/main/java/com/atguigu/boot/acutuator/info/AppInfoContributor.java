package com.atguigu.boot.acutuator.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * @projectName: boot-05-web-admin02
 * @package: com.atguigu.boot.acutuator.info
 * @className: AppInfo
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/25 16:59
 * @version: 1.0
 */
@Component
public class AppInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("hello","atguigu").withDetail("msg","你好")
                .withDetails(Collections.singletonMap("world","666"));
    }
}
