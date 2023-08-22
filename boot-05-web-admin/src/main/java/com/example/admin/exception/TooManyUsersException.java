package com.example.admin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @projectName: boot-05-web-admin
 * @package: com.example.admin.exception
 * @className: TooManyUsersException
 * @author: SingKwan
 * @description: TODO 学习使用ResponseStatus和自定义异常
 * @date: 2023/4/19 20:11
 * @version: 1.0
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "用户数量过多")
public class TooManyUsersException extends RuntimeException{

    public TooManyUsersException(){

    }
    public TooManyUsersException(String message){
        super(message);
    }
}
