package com.winter.survey.service;

import com.winter.survey.bean.Survey;
import com.winter.survey.dao.SurveyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetSurveyTitle {
    @Autowired
    SurveyMapper surveyMapper;

    public boolean setTitle(Survey survey){
        if (surveyMapper.query(survey) == null){
            surveyMapper.insert(survey);
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteTitle(Survey survey){
        surveyMapper.delete(survey);
        return true;
    }

    public Survey queryTitle(Survey survey){
        return surveyMapper.query(survey);
    }

    public boolean updateTitle(Survey survey){
        surveyMapper.update(survey);
        return true;
    }
}
