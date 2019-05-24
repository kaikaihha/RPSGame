package com.day7.prac2;

public class TestTriAngle {
    public static void main(String[] args) {
        TriAngle triAngle = new TriAngle();
        triAngle.setBase(1);
        triAngle.setHeight(1);
        System.out.println("底："+triAngle.getBase()+"高："+triAngle.getHeight()+"的三角形面积为："+(triAngle.getBase()*triAngle.getHeight()/2));
    }
}
