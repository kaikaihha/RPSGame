package com.rps.v2pro.service;

public interface GameService {
    /**
     * 判断单局输赢
     * @return
     */
    public void judge();

    /**
     * 游戏开始
     */
    public void startGame();

    /**
     * 游戏结果显示
     */
    public void showResult();

    /**
     * 计算游戏结果
     */
    public void calResult();

    /**
     * 游戏初始化
     */
    public void init();

    /**
     * 判断游戏是否存在压倒性趋势
     */
    public int judgeHugeWin();

}
