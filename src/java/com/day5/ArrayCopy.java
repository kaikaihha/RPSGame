package com.day5;

/**
 * @author KaiKai
 *
 */

public class ArrayCopy {
    public static void main(String[] args) {
        int a[] = {0,1,2,3,4};
        int b[] = {5,6,7,8,9};
        copy(a,1,b,1,3);
    }
    public static void copy(int[] arrS,int beginS,int[] arrT,int beginT,int length){
        beginT--;
        beginS--;
        for(int i = beginT;i < beginT+length; i++){
                arrT[i] = arrS[beginS];
                beginS++;
        }
        for (int x:arrT){
            System.out.println(x);
        }
    }
}
