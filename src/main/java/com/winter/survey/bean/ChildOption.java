package com.winter.survey.bean;

public class ChildOption {
    int id;
    int option_id;
    String option_name;
    int is_selected;

    public ChildOption() {
    }

    public int getId() {
        return this.id;
    }

    public int getOption_id() {
        return this.option_id;
    }

    public String getOption_name() {
        return this.option_name;
    }

    public int getIs_selected() {
        return this.is_selected;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOption_id(int option_id) {
        this.option_id = option_id;
    }

    public void setOption_name(String option_name) {
        this.option_name = option_name;
    }

    public void setIs_selected(int is_selected) {
        this.is_selected = is_selected;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ChildOption)) return false;
        final ChildOption other = (ChildOption) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        if (this.getOption_id() != other.getOption_id()) return false;
        final Object this$option_name = this.getOption_name();
        final Object other$option_name = other.getOption_name();
        if (this$option_name == null ? other$option_name != null : !this$option_name.equals(other$option_name))
            return false;
        if (this.getIs_selected() != other.getIs_selected()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ChildOption;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        result = result * PRIME + this.getOption_id();
        final Object $option_name = this.getOption_name();
        result = result * PRIME + ($option_name == null ? 43 : $option_name.hashCode());
        result = result * PRIME + this.getIs_selected();
        return result;
    }

    public String toString() {
        return "ChildOption(id=" + this.getId() + ", option_id=" + this.getOption_id() + ", option_name=" + this.getOption_name() + ", is_selected=" + this.getIs_selected() + ")";
    }
}
