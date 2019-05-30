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
        System.out.println("游戏规则：1.剪刀，2.石头，3.布");
        System.out.print("请输入数字以选择游戏角色：1.快乐风男，2.快乐跑男，3.快乐球男"+"\n你的选择：");


        Scanner input = new Scanner(System.in);;
        int role = 0;

        while (true){
            try{
                role = input.nextInt();
                break;
            }catch (Exception e){
                System.out.print("请不要输入除上述角色前标数字外字符！\n请重新输入：");
                //写法一：input.next();

                //写法二：
                input = new Scanner(System.in);
            }
        }

        judgeRole(role);

        System.out.print("是否开始游戏？（Y/N）");


        while (true){
            try{
                String isContinue = input.next();
                if(isContinue.equals("y")||isContinue.equals("Y")){
                    while (isContinue.equals("y")||isContinue.equals("Y")){
                        int result = judgeWL( playerShow(input),bootShow());
                        System.out.println("\n结果：");
                        switch (result){
                            case 0:
                                System.out.print("平局哦！");
                                break;
                            case 1:
                                System.out.print("实力不错，你赢了！");
                                break;
                            case -1:
                                System.out.print("真遗憾，惜败！");
                                break;
                            default:
                                System.out.println("出错了！");
                                break;
                        }
                        System.out.print("是否继续猜拳？（Y/N）：");
                        isContinue = input.next();
                    }
                }else if(isContinue.equals("n")||isContinue.equals("N")){
                    break;
                }else {
                    throw new Exception();
                }
            }catch (Exception e){
                System.out.print("一定要输入'y'和'n'的大小写哦！\n请重新输入：");
            }
        }
        endGame();
    }

    //结束游戏
    public void endGame(){
        System.out.print("\n\n最终统计游戏结果：\n");
        System.out.println("玩家角色："+RPSGameV1.PLAYERROLE);
        if(RPSGameV1.PLAYERSCORE>RPSGameV1.BOOTSCORE){
            System.out.print("恭喜你，赢了！得分："+RPSGameV1.PLAYERSCORE+"\n电脑得分："+RPSGameV1.BOOTSCORE);
        }else if(RPSGameV1.PLAYERSCORE==RPSGameV1.BOOTSCORE){
            System.out.print("平局哦！得分："+RPSGameV1.PLAYERSCORE+"\n电脑得分："+RPSGameV1.BOOTSCORE);
        }else if(RPSGameV1.PLAYERSCORE<RPSGameV1.BOOTSCORE){
            System.out.print("很遗憾，你输了！得分："+RPSGameV1.PLAYERSCORE+"\n电脑得分："+RPSGameV1.BOOTSCORE);
        }
    }

    //电脑出拳
    public int bootShow(){
        int show = 1+(int)(Math.random()*10)%3;
        switch (show){
            case 1:
                System.out.print("\n电脑出石头");
                break;
            case 2:
                System.out.print("\n电脑出剪刀");
                break;
            case 3:
                System.out.print("\n电脑出布");
                break;
        }
        return show;
    }

    //玩家出拳
    public int playerShow(Scanner scanner){
        System.out.print("你出了：");
        int pFist = scanner.nextInt();
        switch (pFist){
            case 1:
                System.out.print("你出了石头");
                break;
            case 2:
                System.out.print("你出了剪刀");
                break;
            case 3:
                System.out.print("你出了布");
                break;
        }
        return pFist;
    }

    //
    public int judgeWL(int pFist,int bFist){
        if((pFist==1&&bFist==1)||(pFist==2&&bFist==2)||(pFist==3&&bFist==3)){
            return 0;
        }else if((pFist==1&&bFist==2)||(pFist==2&&bFist==3)||(pFist==3&&bFist==1)){
            RPSGameV1.PLAYERSCORE++;
            return 1;
        }else if((pFist==2&&bFist==1)||(pFist==3&&bFist==2)||(pFist==1&&bFist==3)){
            RPSGameV1.BOOTSCORE++;
            return -1;
        } else {
            return 2;
        }
    }

    public void judgeRole(int roleInt){
        if(roleInt == 1){
            RPSGameV1.PLAYERROLE = "快乐风男";
        }else if(roleInt == 2){
            RPSGameV1.PLAYERROLE = "快乐跑男";
        }else if(roleInt == 3){
            RPSGameV1.PLAYERROLE = "快乐球男";
        }
    }

}
