package com.inspur.demo.service;

import com.inspur.demo.entity.Register;
import com.inspur.demo.mapper.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    
    @Autowired
    RegisterMapper registerMapper;
    
    public Register userSearch (String username) {
        return registerMapper.userSearch(username);
    }
    
    public Register userSave (Register register) {
        return registerMapper.userSave(register);
    }
}
