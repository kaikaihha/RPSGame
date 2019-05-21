package com.day5;

import java.util.Scanner;

public class Goods {
    public static void main(String[] args) {
        System.out.print("输入重量（吨）：");
        Scanner scanner = new Scanner(System.in);

        int weight = scanner.nextInt();

        System.out.println();
        System.out.print("输入货运里程(km)：");
        int dist = scanner.nextInt();

        System.out.println();
        System.out.print("输入单位运费(元)：");
        int fee = scanner.nextInt();

        System.out.println("最后的运费为：" + ifelse(dist, weight, fee));
    }

    public static float ifelse(int dist, int weight, int fee) {
        float resultFee = 0f;

        if (dist > 0 && dist < 500) {
            resultFee = fee;
        } else if (dist >= 500 && dist < 1000) {
            resultFee = fee * 0.95f;
        } else if (dist >= 1000 && dist < 1500) {
            resultFee = fee * 0.92f;
        } else if (dist >= 1500 && dist < 2500) {
            resultFee = fee * 0.9f;
        } else if (dist >= 2500) {
            resultFee = fee * 0.88f;
        }
        return resultFee * dist * weight;
    }
}
