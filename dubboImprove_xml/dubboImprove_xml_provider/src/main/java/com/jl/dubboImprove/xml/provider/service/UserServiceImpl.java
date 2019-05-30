package com.jl.dubboImprove.xml.provider.service;

import com.jl.dubboImprove.model.User;
import com.jl.dubboImprove.service.AddressService;
import com.jl.dubboImprove.service.UserService;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/20 14:03
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {
    @Resource
    private AddressService addressServiceConsu;
    @Override
    public User findUserById() {
        System.out.println(addressServiceConsu.getAddress());
        User user = new User();
        user.setId("dfasdf");
        user.setUsername("dfasdf");
        user.setAge("1");
        user.setSex("dasf");
        user.setAddress(addressServiceConsu.getAddress());
        return user;
    }
}
