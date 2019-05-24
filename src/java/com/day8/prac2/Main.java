package com.day8.prac2;

public class Main {
    public static void main(String[] args) {
        Test test1 = Test.getTest();
        Test test2 = Test.getTest();
        Test test3 = Test.getTest();
        Test test4 = Test.getTest();
        Test test5 = Test.getTest();

        System.out.println(test1.getName());
        System.out.println(test2.getName());
        System.out.println(test3.getName());
        System.out.println(test4.getName());
        System.out.println(test5.getName());

    }
}
