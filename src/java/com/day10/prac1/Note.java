package com.day10.prac1;

import java.util.Date;

public abstract class Note {
    private String name;
    private String className;
    private Date date;
    private String discrap;

    public Note(String name, String className, Date date, String discrap) {
        this.name = name;
        this.className = className;
        this.date = date;
        this.discrap = discrap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDiscrap() {
        return discrap;
    }

    public void setDiscrap(String discrap) {
        this.discrap = discrap;
    }

    public abstract String getNote();

}
