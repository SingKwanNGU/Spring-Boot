package com.atguigu.boot.bean.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @projectName: boot-05-web-admin
 * @package: com.example.admin.bean
 * @className: User
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/16 0:02
 * @version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String password;

    //以下是数据库字段
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
