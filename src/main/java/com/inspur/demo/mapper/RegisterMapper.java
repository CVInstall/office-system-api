package com.inspur.demo.mapper;


import com.inspur.demo.entity.Register;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterMapper {
    Register userSearch(String username);
    
    Register userSave(Register register);
}

