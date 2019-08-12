package com.inspur.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.inspur.demo.entity.Register;
import com.inspur.demo.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/register")
@CrossOrigin
public class RegisterController {
    @Autowired
    private RegisterService registerService;
    
    @RequestMapping(value = "userSearch", method = RequestMethod.POST)
    @ResponseBody
//    HttpServletRequest request
    public Object userSearch(@RequestBody String params) {
        JSONObject param = JSONObject.parseObject(params);
        String username = param.getString("username");
        System.out.println("获取的用户名为：" + username);
//        Object data = params;
//        String username = data.username;
        if (registerService.userSearch(username) == null) {
            return true;
        } else {
            return false;
        }
    }
}
