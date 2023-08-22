package com.example.boot.converter;


import com.example.boot.bean.Person;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * @projectName: boot-05-web-01
 * @package: com.example.boot.converter
 * @className: GuiguMessageConverter
 * @author: SingKwan
 * @description: TODO 自定义converter
 * @date: 2023/4/15 17:05
 * @version: 1.0
 */
public class GuiguMessageConverter implements HttpMessageConverter<Person> {

    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return false;
    }

    @Override
    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
        return clazz.isAssignableFrom(Person.class);
    }
    /**
     * @param :
     * @return List<MediaType>
     * @author perse
     * @description TODO 服务器要统计所有的messageConverter能写出那些内容类型  所以这里我们可以规定我们自己返回的媒体类型
     * @date 2023/4/15 17:11
     */
    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return MediaType.parseMediaTypes("application/x-guigu");
    }

    @Override
    public Person read(Class<? extends Person> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    public void write(Person person, MediaType contentType, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        //自定义协议数据的写出
        String data=person.getUserName()+";"+person.getAge()+";"+person.getBirth();

        //写出去
        OutputStream body = outputMessage.getBody();

        body.write(data.getBytes());
        body.flush();

    }
}
