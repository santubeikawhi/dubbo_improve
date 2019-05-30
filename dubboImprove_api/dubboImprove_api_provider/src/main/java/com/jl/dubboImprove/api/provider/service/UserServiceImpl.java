package com.jl.dubboImprove.api.provider.service;

import com.jl.dubboImprove.model.User;
import com.jl.dubboImprove.service.UserService;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/20 17:52
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {
    User user = new User();

    @Override
    public User findUserById() {
        user.setId("dfasdf");
        user.setUsername("dfasdf");
        user.setAge("1");
        user.setSex("dasf");
        return user;
    }
}
