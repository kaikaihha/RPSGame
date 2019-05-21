package com.day4;

import java.util.Scanner;

public class Yanghui {
    
    public static void main(String[] args) {
        System.out.print("输入你想打印杨辉三角的行数：");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int[][] arr = new int[row][];
        for(int i = 0; i < row; i++){
            arr[i] = new int[i + 1];
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i -1][j] + arr[i - 1][j - 1];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
