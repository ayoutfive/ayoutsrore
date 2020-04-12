package com.itcast.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Noviciate
 * @Date: 2020/4/6/006 20:59
 * @Description: demo
 * @Version: 0.0.1
 */
@RestController
@RequestMapping("hello2")
public class Hello2Controller {

    @GetMapping("show")
    public String test(){
        return "hello Springboot 2";
    }



}
