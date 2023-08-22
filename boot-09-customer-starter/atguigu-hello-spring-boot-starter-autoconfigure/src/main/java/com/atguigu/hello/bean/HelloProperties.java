package com.atguigu.hello.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @projectName: boot-09-customer-starter
 * @package: com.atguigu.hello
 * @className: HelloProperties
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/26 16:13
 * @version: 1.0
 */
@ConfigurationProperties("atguigu.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
