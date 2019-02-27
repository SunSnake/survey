package com.winter.survey.dao;

import com.winter.survey.bean.User;

public interface UserMapper {
    User query(User user);
    void insert(User user);
    void delete(User user);
    void update(User user);
}
