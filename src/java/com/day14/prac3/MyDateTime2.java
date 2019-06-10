package com.day14.prac3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateTime2  {
    Date date =new Date();
    public String getDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }
    public String getDateTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }
}
class test1{
    public static void main(String[] args) {
        System.out.println(new MyDateTime2().getDate());
        System.out.println(new MyDateTime2().getDateTime());
    }
}
