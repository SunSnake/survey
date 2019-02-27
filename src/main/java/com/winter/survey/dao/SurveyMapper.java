package com.winter.survey.dao;

import com.winter.survey.bean.Survey;

public interface SurveyMapper {
    Survey query(Survey survey);
    void insert(Survey survey);
    void delete(Survey survey);
    void update(Survey survey);
}
