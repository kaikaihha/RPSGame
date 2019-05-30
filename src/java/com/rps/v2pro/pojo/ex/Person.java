package com.rps.v2pro.pojo.ex;

import com.rps.v2pro.pojo.Player;

import java.util.Scanner;

/**
 * 玩家类
 * @author KaiKai
 */
public class Person extends Player {

    String name="玩家";

    public void show(Scanner scanner) {
        String pFist = scanner.next();
        switch (pFist){
            case "1":
                System.out.print("你出了石头");
                this.setFist(Integer.valueOf(pFist));
                break;
            case "2":
                System.out.print("你出了剪刀");
                this.setFist(Integer.valueOf(pFist));
                break;
            case "3":
                System.out.print("你出了布");
                this.setFist(Integer.valueOf(pFist));
                break;
            default:
                System.out.print("出错了！只能出（1 石头，2 剪刀，3 布）,请重新输入：");
                show(scanner);

        }
        //this.setFist(Integer.valueOf(pFist));
    }

}
