package com.day10.prac1;

import java.util.Date;

public class Lihua extends Note {
    public Lihua(String name, String className, Date date, String discrap) {
        super(name, className, date, discrap);
    }

    @Override
    public String getNote() {
        return "Note{" +
                "name='" + getName() + '\'' +
                ", className='" + getClassName() + '\'' +
                ", date=" + getDate() +
                ", discrap='" + getDiscrap() + '\'' +
                '}';
    }


}
