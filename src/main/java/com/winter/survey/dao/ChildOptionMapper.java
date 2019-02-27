package com.winter.survey.dao;

import com.winter.survey.bean.ChildOption;

public interface ChildOptionMapper {
    ChildOption query(ChildOption childOption);
    void insert(ChildOption childOption);
    void delete(ChildOption childOption);
    void update(ChildOption childOption);
}
