package com.rps.v2.pojo.ex;

import com.rps.v2.pojo.Player;

import java.util.Scanner;

public class Person extends Player {

    public int show(Scanner scanner) {
        int playerFist = scanner.nextInt();
//        switch (playerFist){
//            case 1:
//                System.out.print("你出了石头");
//                break;
//            case 2:
//                System.out.print("你出了剪刀");
//                break;
//            case 3:
//                System.out.print("你出了布");
//                break;
//        }
        return playerFist;
    }
}
