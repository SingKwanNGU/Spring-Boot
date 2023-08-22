package com.atguigu.boot.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @projectName: boot-05-web-admin02
 * @package: com.atguigu.boot.config
 * @className: MyBatisConfig
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/23 23:42
 * @version: 1.0
 */
@Configuration
public class MyBatisConfig {

    @Bean
    public MybatisPlusInterceptor paginationInteceptor(){
        MybatisPlusInterceptor mybatisPlusInterceptor=new MybatisPlusInterceptor();
        PaginationInnerInterceptor interceptor=new PaginationInnerInterceptor();
        interceptor.setOverflow(true);
        interceptor.setMaxLimit(500L);
        mybatisPlusInterceptor.addInnerInterceptor(interceptor);

        return mybatisPlusInterceptor;
    }

}
