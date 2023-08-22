package com.atguigu.boot.mapper;

import com.atguigu.boot.bean.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {

    public Book getBook(Integer bookId);
}
