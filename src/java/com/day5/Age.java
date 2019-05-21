package com.day5;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.print("输入年纪(岁)：");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        ifelse(age);
        swicher(age);

    }
    public static void ifelse(int age){
        if(age>=0&&age<=9){
            System.out.println("儿童");
        }else if(age>=10&&age<=19){
            System.out.println("少年");
        }else if(age>=20&&age<=29){
            System.out.println("青少年");
        }else if(age>=30&&age<=39){
            System.out.println("青年");
        }else if(age>=40&&age<=49){
            System.out.println("壮年");
        }else if(age>=50&&age<=59){
            System.out.println("中年");
        }else if(age>=60&&age<=69){
            System.out.println("中老年");
        }else if(age>=70&&age<=79){
            System.out.println("老年");
        }else if(age>=80&&age<=89){
            System.out.println("老老年");
        }else if(age>=90&&age<=99){
            System.out.println("老老老年");
        }
    }
    public static void swicher(int age){
        switch (age/10){
            case 0:
                System.out.println("儿童");
                break;
            case 1:
                System.out.println("少年");
                break;
            case 2:
                System.out.println("青少年");
                break;
            case 3:
                System.out.println("青年");
                break;
            case 4:
                System.out.println("壮年");
                break;
            case 5:
                System.out.println("中年");
                break;
            case 6:
                System.out.println("中老年");
                break;
            case 7:
                System.out.println("老年");
                break;
            case 8:
                System.out.println("老老年");
                break;
            case 9:
                System.out.println("老老老年");
                break;
        }
    }

}
