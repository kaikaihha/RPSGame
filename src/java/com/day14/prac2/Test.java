package com.day14.prac2;

public class Test implements TestInter{
    @Override
    public void loop() {
        int sum = 0;
        for(int i = 0;i < 100000 ; i++){
            sum+=i;
        }
    }
}
