package com.rps.v3_gui_oop.service;

public class GameImpl implements Game{

    /**
     *
     * @param pF 玩家fist
     * @param bF 电脑fist
     * @return 1和局，2玩家赢，3玩家输,0未知结果
     */
    @Override
    public int judge(int pF, int bF) {
        if((pF==1&&bF==1)||(pF==2&&bF==2)||(pF==3&&bF==3)){
            return 1;
        }else if((pF==1&&bF==2)||(pF==2&&bF==3)||(pF==3&&bF==1)){
            return 2;
        }else if((pF==2&&bF==1)||(pF==3&&bF==2)||(pF==1&&bF==3)){
            return 3;
        }else return 0;
    }

    @Override
    public int judgeLastResult() {
        return 0;
    }
}
