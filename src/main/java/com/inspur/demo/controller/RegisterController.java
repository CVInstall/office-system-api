package com.inspur.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.inspur.demo.entity.Register;
import com.inspur.demo.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
@CrossOrigin
public class RegisterController {
    @Autowired
    private RegisterService registerService;
    
    @RequestMapping(value = "userSearch", method = RequestMethod.POST)
    @ResponseBody
    public Object userSearch(@RequestBody String params) {
        JSONObject param = JSONObject.parseObject(params);
        String username = param.getString("username");
        if (registerService.userSearch(username) == null) {
            return true;
        } else {
            return false;
        }
    }
    
    @RequestMapping(value = "userSave", method = RequestMethod.POST)
    @ResponseBody
    public Object userSave(@RequestBody Register register) {
        if (registerService.userSave(register) != null) {
            return true;
        } else {
            return false;
        }
    }
}
