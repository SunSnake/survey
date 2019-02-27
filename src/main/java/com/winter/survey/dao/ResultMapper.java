package com.winter.survey.dao;

import com.winter.survey.bean.Result;

public interface ResultMapper {
    Result query(Result result);
    void insert(Result result);
    void delete(Result result);
    void update(Result result);
}
