package com.day8.prac1;

public class Main {
    public static void main(String[] args) {
        Obj obj = new Obj();
        new Obj();
        new Obj();
        new Obj();
        new Obj();
        new Obj();
        new Obj();
        new Obj();
        new Obj();
        new Obj();
        System.out.println("共有"+Obj.count+"个实例化对象");
    }
}
