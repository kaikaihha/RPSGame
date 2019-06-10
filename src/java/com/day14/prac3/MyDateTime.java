package com.day14.prac3;


import java.util.Calendar;

/**
 * 基于Calendar
 */
public class MyDateTime{
    int year;
    int month;
    int day;
    int hour;
    int minute;
    int second;
    Calendar calendar = Calendar.getInstance();
    public void getDate(){
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH)+1;
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }
    public void getDateTime(){
        getDate();
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);
    }
    public String getDateString(){
        getDate();
        return year+"-"+month+"-"+day;
    }
    public String getDateTimeString(){
        getDateTime();
        return year+"-"+month+"-"+day+"\t"+hour+":"+minute+":"+second;
    }
}
class test{
    public static void main(String[] args) {
        System.out.println(new MyDateTime().getDateString());
        System.out.println(new MyDateTime().getDateTimeString());
    }
}