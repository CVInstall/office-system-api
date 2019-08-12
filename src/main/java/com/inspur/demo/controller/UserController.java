package com.inspur.demo.controller;

import com.inspur.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(value = "userConfirm", method = RequestMethod.GET)
    public Object userConfirm(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        System.out.print("获取的用户名为：" + request.getParameter("username") + " | ");
        String password = request.getParameter("password");
        System.out.println("获取的密码为：" + request.getParameter("password"));
        return userService.userConfirm(username,password);
    }
}
