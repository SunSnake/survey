package com.winter.survey.bean;

public class Option {
    int id;
    int survey_id;
    String option_title;

    public Option() {
    }


    public int getId() {
        return this.id;
    }

    public int getSurvey_id() {
        return this.survey_id;
    }

    public String getOption_title() {
        return this.option_title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurvey_id(int survey_id) {
        this.survey_id = survey_id;
    }

    public void setOption_title(String option_title) {
        this.option_title = option_title;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Option)) return false;
        final Option other = (Option) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        if (this.getSurvey_id() != other.getSurvey_id()) return false;
        final Object this$option_title = this.getOption_title();
        final Object other$option_title = other.getOption_title();
        if (this$option_title == null ? other$option_title != null : !this$option_title.equals(other$option_title))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Option;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        result = result * PRIME + this.getSurvey_id();
        final Object $option_title = this.getOption_title();
        result = result * PRIME + ($option_title == null ? 43 : $option_title.hashCode());
        return result;
    }

    public String toString() {
        return "Option(id=" + this.getId() + ", survey_id=" + this.getSurvey_id() + ", option_title=" + this.getOption_title() + ")";
    }
}
