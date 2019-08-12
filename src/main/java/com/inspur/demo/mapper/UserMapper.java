package com.inspur.demo.mapper;

import com.inspur.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User userConfirm(String username, String password);
}
