package com.rps.v2.pojo.ex;

import com.rps.v2.pojo.Player;

public class Boot extends Player {
    @Override
    public int show() {
        int show = 1+(int)(Math.random()*10)%3;
//        switch (show){
//            case 1:
//                System.out.print("\n电脑出石头");
//                break;
//            case 2:
//                System.out.print("\n电脑出剪刀");
//                break;
//            case 3:
//                System.out.print("\n电脑出布");
//                break;
//        }
        return show;
    }
}
