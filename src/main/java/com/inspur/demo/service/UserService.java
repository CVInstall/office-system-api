package com.inspur.demo.service;

import com.inspur.demo.entity.User;
import com.inspur.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    
    public User userConfirm(String username, String password) {
        return userMapper.userConfirm(username, password);
    }
}
