package com.itcast.controller;

import com.itcast.pojo.User;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import sun.dc.pr.PRError;

import java.util.List;

/**
 * @Auther: Noviciate
 * @Date: 2020/4/6/006 22:25
 * @Description: code
 * @Version: 0.0.1
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id")long id){
        System.out.println("id:"+id);
        User user = userService.quertUserById(id);
        System.out.println("user:  "+user);
        return user;



    }



    @GetMapping("test")
    public String test(){
        return "hello ssm";
    }

    @GetMapping("all")
    public String all(Model model) {
        // 查询用户
        List<User> users = this.userService.quertUser();
        // 放入模型
        model.addAttribute("users", users);
        // 返回模板名称（就是classpath:/templates/目录下的html文件名）
        return "users";
    }

}
