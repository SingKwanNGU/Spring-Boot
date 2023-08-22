package com.atguigu.boot.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @projectName: boot-05-web-admin
 * @package: com.example.admin.exception
 * @className: GlobalExceptionHandler
 * @author: SingKwan
 * @description: TODO 处理整个web controller的异常
 * @date: 2023/4/19 18:33
 * @version: 1.0
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ArithmeticException.class, NullPointerException.class})
    public String handlerException(Exception e){
        log.error("异常是:{}",e);
        return "login";
    }
}
