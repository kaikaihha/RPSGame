package com.day19.prac1;

import java.util.ArrayList;
import java.util.List;

public class Prac1 {

    public void bingji(){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);

        list2.add(3);
        list2.add(4);

        list1.addAll(list2);
        for (Integer integer:list1){
            System.out.println(integer);
        }
    }
    public void jiaoji(){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);

        list2.add(2);
        list2.add(3);

        for (Integer integer:list1){
            for (Integer integer1:list2){
                if (integer == integer1){
                    list3.add(integer1);
                }
            }
        }
        for (Integer integer:list3){
            System.out.println(integer);
        }
    }
    public void chaji(){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);

        list2.add(2);
        list2.add(3);

        list1.removeAll(list2);

        for (Integer integer:list1){
            System.out.println(integer);
        }
    }
    public void wcfJiaoji(){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);

        list2.add(2);
        list2.add(3);
        list2.add(4);

        list1.removeAll(list2);
        list1.addAll(list2);

        for (Integer integer:list1){
            System.out.println(integer);
        }
    }
    }
class t{
    public static void main(String[] args) {
        Prac1 prac1 = new Prac1();
        //prac1.bingji();
        prac1.chaji();
        //prac1.jiaoji();
        //prac1.wcfJiaoji();
    }
}
