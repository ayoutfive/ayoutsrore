package com.itcast.service;

import com.itcast.mapper.UserMapper;
import com.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: Noviciate
 * @Date: 2020/4/7/007 23:17
 * @Description: code
 * @Version: 0.0.1
 */
@Service
public class Userservice {
    @Autowired
    public UserMapper userMapper;


    public User queryUserById(Long id){
        return this.userMapper.selectByPrimaryKey(id);

    }


}
