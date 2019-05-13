package com.rps;

public class RPSGameV1 {
    public static int PLAYERSCORE = 0;//玩家分数
    public static int BOOTSCORE = 0;//电脑分数

    public RPSGameV1(){
        startGame();
    }

    //开始游戏
    public void startGame(){
        System.out.println("--------------猜拳游戏开始--------------");
        System.out.println("请输入数字以选择游戏角色：1.快乐风男，2.快乐跑男，3.快乐球男");
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
}
