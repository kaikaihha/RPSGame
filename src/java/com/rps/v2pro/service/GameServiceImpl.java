package com.rps.v2pro.service;

import com.rps.v2pro.pojo.Game;
import com.rps.v2pro.pojo.ex.Boot;
import com.rps.v2pro.pojo.ex.Person;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GameServiceImpl extends Game implements GameService {

    public static Scanner scanner = new Scanner(System.in);


    /**
     * 判断输赢
     * @return
     */
    @Override
    public void judge() {
        int fistP = person.getFist();
        int fistB = boot.getFist();
        if((fistP==1&&fistB==1)||(fistP==2&&fistB==2)||(fistP==3&&fistB==3)){
            System.out.println("这局平局！");
        }else if((fistP==1&&fistB==2)||(fistP==2&&fistB==3)||(fistP==3&&fistB==1)){
            System.out.println("你赢了！");
            person.setScore(person.getScore()+1);
        }else if((fistP==2&&fistB==1)||(fistP==3&&fistB==2)||(fistP==1&&fistB==3)){
            System.out.println("电脑赢了!");
            boot.setScore(boot.getScore()+1);
        }
        count++;

    }

    /**
     * 游戏开始
     */
    @Override
    public void startGame() {
        init();
        String re = scanner.next();
        while (true){
            System.out.println("----------第--"+(count+1)+"--局----------");
            System.out.print("轮到你了，请出拳：");
            person.show(scanner);
            boot.show();
            judge();
            if(judgeHugeWin()==1){
                break;
            }
            if(gameTimesLimit == count){
                break;
            }
        }
        System.out.println();
        System.out.println(person.getRole()+"\tVS\t"+boot.getRole());
        calResult();
        showResult();
        scanner.close();
    }

    /**
     * 显示游戏结果
     */
    @Override
    public void showResult() {
        System.out.println("游戏结果：");
        System.out.println("玩家得分："+ person.getScore());
        System.out.println("电脑得分："+boot.getScore());

    }

    @Override
    public void calResult() {
        System.out.println("共进行："+count+"局");
        if(person.getScore()>boot.getScore()){
            System.out.println("恭喜你，赢了！");
        }else if(person.getScore()==boot.getScore()){
            System.out.println("本次游戏平局哦！下次再打败电脑！");
        }else{
            System.out.println("惜败，下次加油！");
        }
    }

    @Override
    public void init() {
        person = new Person();
        boot = new Boot();
        boot.setRole("电脑");
        System.out.println("**********猜拳游戏**********");
        System.out.print("\t\t游戏开始\n");
        System.out.println("****************************");
        System.out.println("游戏规则：1 石头，2 剪刀，3 布");
        System.out.print("输入你的游戏名：");
        String name = scanner.nextLine();
        person.setRole(name);
        System.out.print("输入你想进行的局数：");
        setTimesLimit();
        System.out.println("是否开始？（Y/N）");
    }

    /**
     *
     * @return 1，表示有玩家大胜；0，表示平常对局
     */
    @Override
    public int judgeHugeWin() {
        if((person.getScore()>=gameTimesLimit/2+1)||(boot.getScore()>=gameTimesLimit/2+1)){
            return 1;
        }else {
            return 0;
        }
    }

    public void setTimesLimit(){
        Pattern pattern = Pattern.compile("\\d{1,2}");
        boolean re = false;
        while (true){
            String timesLimit = scanner.next();
            Matcher matcher = pattern.matcher(timesLimit);
            re = matcher.matches();
            if(re){
                gameTimesLimit = Integer.valueOf(timesLimit);
                break;
            }else {
                System.out.print("请重新输入游戏次数：");
            }
        }
    }
}
