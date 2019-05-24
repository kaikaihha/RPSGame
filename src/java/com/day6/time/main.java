package com.day6.time;

public class main {
    public static void main(String[] args) {
        TimeUtil timeUtil = new TimeUtil(2,59,60);
        //timeUtil.addMinute(60);
        timeUtil.subSecond(61);
        System.out.println(timeUtil.toString());
    }
}
