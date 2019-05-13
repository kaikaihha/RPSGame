package com.rps.V1;

import java.util.Scanner;

public class RPSGameV1 {
    public static int PLAYERSCORE = 0;//玩家分数
    public static int BOOTSCORE = 0;//电脑分数

    public static String PLAYERROLE = "";//玩家角色
    public static String BOOTROLE = "";//电脑角色

    public RPSGameV1(){
        startGame();
    }

    //开始游戏
    public void startGame(){
        System.out.println("--------------猜拳游戏开始--------------");
        System.out.println("请输入数字以选择游戏角色：1.快乐风男，2.快乐跑男，3.快乐球男");

        Scanner input = new Scanner(System.in);

        int role = input.nextInt();
        judgeRole(role);




    }

    //结束游戏
    public void endGame(){

    }

    //电脑出拳
    public int bootShow(){

    }

    //玩家出拳
    public int playerShow(){

    }

    //
    public int judgeWL(){

    }

    public String judgeRole(int roleInt){
        if(roleInt == 1){
            RPSGameV1.PLAYERROLE = "快乐风男";
        }else if(roleInt == 2){
            RPSGameV1.PLAYERROLE = "快乐跑男";
        }else if(roleInt == 3){
            RPSGameV1.PLAYERROLE = "快乐球男";
        }
    }
}
