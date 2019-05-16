package com.day2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        int score = 0;
        System.out.print("请输入10个分数，以回车结束一次输入：");
        while (true){
            try {
                score = input.nextInt();
                if(score<0||score>100){
                    throw new Exception();
                }
                sum += score;
                if(counter++ >= 9){
                    break;
                }
            }catch (Exception e){
                System.out.print("请输入数字：");
            }
        }
        System.out.println("成绩总分分："+sum+"\t平均分为"+String.format("%.3f",sum/10.0));
    }
}
