package com.rps.v2pro.pojo.ex;

import com.rps.v2pro.pojo.Player;

public class Boot extends Player {

    @Override
    public void show() {
        int bFist = 1+(int)(Math.random()*10)%3;
        switch (bFist){
            case 1:
                System.out.println("\n电脑出石头");
                break;
            case 2:
                System.out.println("\n电脑出剪刀");
                break;
            case 3:
                System.out.println("\n电脑出布");
                break;
        }
        this.setFist(Integer.valueOf(bFist));
    }
}
