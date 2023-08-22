package com.example.boot.config;

import com.example.boot.bean.Pet;
import com.example.boot.converter.GuiguMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.util.StringUtils;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;
import org.springframework.web.accept.ParameterContentNegotiationStrategy;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @projectName: boot-05-web-01
 * @package: com.example.boot.config
 * @className: WebConfig
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/12 22:46
 * @version: 1.0
 */
@Configuration
public class WebConfig {


    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            //添加扩展的消息转换器
            @Override
            public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
                converters.add(new GuiguMessageConverter());
            }

            //添加自定义内容协商策略ParameterContentNegotiationStrategy且可以重写响应的媒体类型
            //会覆盖原来的所有协商策略。
            //如果不想覆盖之前的协商策略，可以使用Configurer.mediaType()方法添加扩展的媒体类型
            @Override
            public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
                Map<String, MediaType> mediaType = new HashMap<>();
                mediaType.put("json",MediaType.APPLICATION_JSON);
                mediaType.put("xml",MediaType.APPLICATION_XML);
                mediaType.put("gg",MediaType.parseMediaType("application/x-guigu"));
                ParameterContentNegotiationStrategy parameterStrategy=new ParameterContentNegotiationStrategy(mediaType);
                HeaderContentNegotiationStrategy headerStrategy=new HeaderContentNegotiationStrategy();
                configurer.strategies(Arrays.asList(parameterStrategy,headerStrategy));

            }
            //添加自定义内容协商策略 ParameterContentNegotiationStrategy使用format获取json和xml响应
            @Override
            public void addFormatters(FormatterRegistry registry) {
                registry.addConverter(new Converter<String, Pet>() {
                    @Override
                    public Pet convert(String source) {
                        if (!StringUtils.isEmpty(source)){
                            Pet pet=new Pet();
                            String[] split = source.split(",");
                            pet.setName(split[0]);
                            pet.setAge(Integer.parseInt(split[1]));
                            return pet;
                        }
                        return null;
                    }
                });
            }
        };
    }
}
