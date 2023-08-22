package com.atguigu.boot.service.Impl;

import com.atguigu.boot.bean.bean.User;
import com.atguigu.boot.mapper.UserMapper;
import com.atguigu.boot.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @projectName: boot-05-web-admin02
 * @package: com.atguigu.boot.service.Impl
 * @className: UserServiceImpl
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/23 21:18
 * @version: 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
