package com.jl.dubboImprove.xml.consumer.controller;

import com.jl.dubboImprove.model.User;
import com.jl.dubboImprove.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/20 16:42
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/findById")
    public User getUserById(){
        return userService.findUserById();
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
