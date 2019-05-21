package com.day5;

import java.util.Scanner;

public class Cold {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入当前温度(℃)：");
        int temp = scanner.nextInt();

        if(temp<=10){
            System.out.println(temp+"℃有点冷，要多穿衣服");
        }else if(temp>10&&temp<=25){
            System.out.println(temp+"℃正合适，出去玩吧");
        }else if(temp>25&&temp<=35){
            System.out.println(temp+"℃有点热");
        }else if(temp>35){
            System.out.println(temp+"℃太热了！开空调");
        }
    }
}
