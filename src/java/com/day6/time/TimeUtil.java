package com.day6.time;

public class TimeUtil {
    private long hour;
    private long minute;
    private long second;
    private long secAll;

    public TimeUtil(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public void addSecond(int sec){
//        if(sec>=0){
//            if(sec+second>60||sec+second<-60){
//                second=(sec+second)%60;
//                minute=minute+(sec+second)/60;
//                if(minute>60){
//                    hour=hour+minute/60;
//                    minute=minute%60;
//                }
//            }else {
//                second = sec + second;
//            }
//        }else{
//            if(sec+second>60){
//                second=(sec+second)%60;
//                minute=minute+(sec+second)/60;
//                if(minute>60){
//                    hour=hour+minute/60;
//                    minute=minute%60;
//                }
//            }else if(sec<60&&sec>=0){
//                second=sec+second;
//            }
//        }

        secAll = hour*3600+minute*60+second;
        long temp = secAll+sec;

        hour=temp/3600;
        minute=temp%3600/60;
        second=temp%3600%60;



    }
    public void addMinute(int min){
        addSecond(min*60);
    }
    public void addHour(int hou){
        addSecond(hou*60*60);
    }
    public void subSecond(int sec){
        addSecond(-sec);
    }
    public void subMinute(int min){
        addSecond(-min*60);
    }
    public void subHour(int hou){
        addSecond(-hou*60*60);
    }

    @Override
    public String toString() {
        return "TimeUtil{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
