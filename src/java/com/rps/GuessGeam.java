package com.rps;

import java.util.Scanner;

public class GuessGeam {

    private static String computer="";//表示电脑
    private static String person="";//表示用户
    private static int computerScore=0;//表示电脑的成绩
    private static int personScore=0;//表示用户的成绩
    private static int geamCount=0;//表示比赛次数

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("----------------欢 迎 进 入 游 戏 世 界----------------\n");
        System.out.println("\n\t\t******************");
        System.out.println("\t\t**  猜拳, 开始    **");
        System.out.println("\t\t******************");

        System.out.println("\n\n出拳规则：1.剪刀 2.石头 3.布");
        /*选择对方角色*/
        System.out.print("请选择角色（1：张无忌 2：乔峰 3：令狐冲）： ");
        Scanner input = new Scanner(System.in);
        int role = input.nextInt();
        if(role == 1){
            computer = "刘备";
        }else if(role == 2){
            computer = "孙权";
        }else if(role == 3){
            computer = "曹操";
        }

        System.out.print("\n要开始吗？（y/n） ");
        String con = input.next();
        int perFist;   //用户出的拳
        int compFist;  //计算机出的拳
        while(con.equals("y")){
            /*出拳*/
            perFist = personShowFist();//用户出拳
            compFist = computerShowFist();//电脑出拳
            /*裁决*/
            if((perFist == 1 && compFist == 1) || (perFist == 2 && compFist == 2) || (perFist == 3 && compFist == 3)){
                System.out.println("结果:和局,真衰！嘿嘿,等着瞧吧 !\n");  //平局
                //1.剪刀 剪 3.布 赢；|| 2.石头 砸 1.剪刀 赢；|| 3.布 盖 2.石头 赢；
            }else if((perFist == 1 && compFist == 3) || (perFist == 2  && compFist == 1) || (perFist == 3 && compFist == 2)){
                System.out.println("结果： 恭喜， 你赢了！");  //用户赢
                personScore++;
            }else{
                System.out.println("结果说:^_^,你输了，真笨!\n");  //计算机赢
                computerScore++;
            }
            geamCount++;
            System.out.print("\n是否开始下一轮（y/n）:  ");
            con = input.next();
        }
        /*显示结果*/
        showResult();
    }

    /**
     * 显示比赛结果
     */
    private static void showResult() {
        /*显示最后结果*/
        System.out.println("---------------------------------------------------");
        System.out.println(computer + "  VS  " + person);
        System.out.println("对战次数："+ geamCount);
        int result = calcResult();
        if(result == 1){
            System.out.println("结果：打成平手，下次再和你一分高下！");
        }else if(result == 2){
            System.out.println("结果：恭喜恭喜！");   //用户获胜
        }else{
            System.out.println("结果：呵呵，笨笨，下次加油啊！");   //计算机获胜
        }
        System.out.println("---------------------------------------------------");
    }

    /**
     * 计算成绩
     * @return
     */
    private static int calcResult() {
        if(personScore == computerScore){
            return 1; //平局
        }else if(personScore > computerScore){
            return 2; //用户赢
        }else{
            return 3; //计算机赢
        }
    }

    /**
     * 电脑随机出拳
     * @return
     */
    private static int computerShowFist() {
        int show = (int) (Math.random() * 10) % 3 + 1; //产生随机数，表示电脑出拳
        switch (show) {
            case 1:
                System.out.println("电脑出拳: 剪刀");
                break;
            case 2:
                System.out.println("电脑出拳: 石头");
                break;
            case 3:
                System.out.println("电脑出拳: 布");
                break;
        }
        return show;
    }

    /**
     * 用户选择出拳
     * @return
     */
    @SuppressWarnings("resource")
    private static int personShowFist() {
        Scanner input1 = new Scanner(System.in);
        System.out.print("\n请出拳:1.剪刀 2.石头 3.布 (输入相应数字) :");
        int show = input1.nextInt();
        switch(show){
            case 1:
                System.out.println("你出拳: 剪刀");
                break;
            case 2:
                System.out.println("你出拳: 石头");
                break;
            case 3:
                System.out.println("你出拳: 布");
                break;
        }
        return show;
    }
}
