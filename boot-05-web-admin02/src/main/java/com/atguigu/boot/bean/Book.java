package com.atguigu.boot.bean;

import lombok.Data;

/**
 * @projectName: boot-05-web-admin02
 * @package: com.atguigu.boot.bean
 * @className: Book
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/22 16:37
 * @version: 1.0
 */
@Data
public class Book {
    private Integer bookId;
    private String bookName;
    private Integer price;
    private Integer stock;
}
