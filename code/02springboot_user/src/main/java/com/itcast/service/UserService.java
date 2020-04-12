package com.itcast.service;

import com.itcast.mapper.UserMapper;
import com.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: Noviciate
 * @Date: 2020/4/6/006 22:50
 * @Description: code
 * @Version: 0.0.1
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public User quertUserById(Long id) {
        System.out.println("service");
        User user = userMapper.selectByPrimaryKey(id);
        System.out.println("Service user:"+user);
        return this.userMapper.selectByPrimaryKey(id);
    }
    public List<User> quertUser() {

        return  this.userMapper.selectAll();
    }


    @Transactional
    public void deletetUserById(Long id) {
        this.userMapper.deleteByPrimaryKey(id);
    }


}
