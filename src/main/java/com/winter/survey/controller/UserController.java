package com.winter.survey.controller;

import com.winter.survey.bean.User;
import com.winter.survey.service.LoginAction;
import com.winter.survey.service.RegeditAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private RegeditAction regeditAction;

    @Autowired
    private LoginAction loginAction;

    @RequestMapping("/regedit")
    public String regedit(@RequestBody User user){
        if (regeditAction.InsertUser(user)){
            return "注册成功";
        } else{
            return "注册失败";
        }
    }

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        if (loginAction.varifyUser(user)){
            return "登录成功";
        } else{
            return "登录失败";
        }
    }
}
