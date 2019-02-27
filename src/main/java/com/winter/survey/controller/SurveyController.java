package com.winter.survey.controller;

import com.winter.survey.bean.Survey;
import com.winter.survey.service.SetSurveyTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SurveyController {

    @Autowired
    SetSurveyTitle setSurveyTitle;

    @RequestMapping("/setTitle")
    public String setTitle(@RequestBody Survey survey){
        if (setSurveyTitle.setTitle(survey)){
            return "新增成功";
        } else {
            return "新增失败";
        }
    }

    @RequestMapping("/deleteTitle")
    public String deleteTitle(@RequestBody Survey survey){
        if (setSurveyTitle.deleteTitle(survey)){
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    @RequestMapping("/updateTitle")
    public String updateTitle(@RequestBody Survey survey){
        if (setSurveyTitle.updateTitle(survey)){
            return "修改题目成功";
        } else {
            return "修改题目失败";
        }
    }
}
