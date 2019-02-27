package com.winter.survey.dao;

import com.winter.survey.bean.Option;

public interface OptionMapper {
    Option query(Option option);
    void insert(Option option);
    void delete(Option option);
    void update(Option option);
}
