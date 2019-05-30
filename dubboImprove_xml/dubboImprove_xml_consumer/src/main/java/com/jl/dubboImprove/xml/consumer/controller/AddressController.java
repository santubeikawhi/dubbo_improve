package com.jl.dubboImprove.xml.consumer.controller;

import com.jl.dubboImprove.model.User;
import com.jl.dubboImprove.service.AddressService;
import com.jl.dubboImprove.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName AddressController
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/21 11:32
 * @Version 1.0
 */
@RestController
@RequestMapping("/address")
public class AddressController {
    @Resource
    private AddressService addressService;

    @RequestMapping("/findById")
    public String getUserById(){
        return addressService.getAddress();
    }
}
