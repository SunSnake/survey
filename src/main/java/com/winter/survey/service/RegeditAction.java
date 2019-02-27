package com.winter.survey.service;

import com.winter.survey.bean.User;
import com.winter.survey.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegeditAction {

    @Autowired
    private UserMapper userMapper;

    public boolean InsertUser(User user){

        if (userMapper.query(user) == null){
            userMapper.insert(user);
            return true;
        } else {
            return false;
        }
    }
}
