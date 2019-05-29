package com.day10.prac1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Lihua lihua = new Lihua("lihua","160x",new Date(),"肚子痛");
        System.out.println(lihua.getNote());
    }
}
