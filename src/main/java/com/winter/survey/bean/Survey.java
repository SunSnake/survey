package com.winter.survey.bean;

public class Survey {
    int id;
    String survey_title;

    public Survey() {
    }

    public int getId() {
        return this.id;
    }

    public String getSurvey_title() {
        return this.survey_title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurvey_title(String survey_title) {
        this.survey_title = survey_title;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Survey)) return false;
        final Survey other = (Survey) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        final Object this$survey_title = this.getSurvey_title();
        final Object other$survey_title = other.getSurvey_title();
        if (this$survey_title == null ? other$survey_title != null : !this$survey_title.equals(other$survey_title))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Survey;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        final Object $survey_title = this.getSurvey_title();
        result = result * PRIME + ($survey_title == null ? 43 : $survey_title.hashCode());
        return result;
    }

    public String toString() {
        return "Survey(id=" + this.getId() + ", survey_title=" + this.getSurvey_title() + ")";
    }
}
