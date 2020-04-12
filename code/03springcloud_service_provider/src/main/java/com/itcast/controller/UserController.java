package com.itcast.controller;

import com.itcast.pojo.User;
import com.itcast.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Noviciate
 * @Date: 2020/4/7/007 23:18
 * @Description: code
 * @Version: 0.0.1
 */
@RestController
@RequestMapping("user")
public class UserController {


    @Autowired
    private Userservice userservice;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id")long id){
        return userservice.queryUserById(id);
    }

}
