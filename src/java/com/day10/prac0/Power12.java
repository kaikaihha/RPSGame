package com.day10.prac0;

public class Power12 extends AbsBasePower implements IPower12 {
    // 12V电源构造方法
    public Power12() {
        super(12);
    }
    // 12V电源输出
    public void output12v() {
        System.out.println("----这是[" + this.getPower() + this.getUnit()
                + "]电源！...");
    }
}