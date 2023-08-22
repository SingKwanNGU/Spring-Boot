package com.example.admin.bean;

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

    private String userName;
    private String password;
}
