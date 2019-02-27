package com.winter.survey.bean;

public class Result {
    int id;
    int child_id;
    int child_count;

    public Result() {
    }

    public int getId() {
        return this.id;
    }

    public int getChild_id() {
        return this.child_id;
    }

    public int getChild_count() {
        return this.child_count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setChild_id(int child_id) {
        this.child_id = child_id;
    }

    public void setChild_count(int child_count) {
        this.child_count = child_count;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Result)) return false;
        final Result other = (Result) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() != other.getId()) return false;
        if (this.getChild_id() != other.getChild_id()) return false;
        if (this.getChild_count() != other.getChild_count()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Result;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId();
        result = result * PRIME + this.getChild_id();
        result = result * PRIME + this.getChild_count();
        return result;
    }

    public String toString() {
        return "Result(id=" + this.getId() + ", child_id=" + this.getChild_id() + ", child_count=" + this.getChild_count() + ")";
    }
}
