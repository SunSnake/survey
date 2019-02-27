package com.winter.survey.service;

import com.winter.survey.bean.User;
import com.winter.survey.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginAction {

    @Autowired
    private UserMapper userMapper;

    public boolean varifyUser(User user){
        User u = userMapper.query(user);

        if (u != null && u.getPassword().equals(user.getPassword())){
            return true;
        } else {
            return false;
        }
    }
}
