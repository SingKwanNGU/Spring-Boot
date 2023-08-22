package com.atguigu.boot.service.Impl;

import com.atguigu.boot.bean.Book;
import com.atguigu.boot.mapper.BookMapper;
import com.atguigu.boot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @projectName: boot-05-web-admin02
 * @package: com.atguigu.boot.service
 * @className: BookService
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/22 22:01
 * @version: 1.0
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    public Book getBook(Integer id){

        return bookMapper.getBook(id);
    }



}
