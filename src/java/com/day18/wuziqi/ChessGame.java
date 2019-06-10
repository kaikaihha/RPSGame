package com.day18.wuziqi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChessGame extends JFrame {
    JPanel chessBoard;

    JButton startGame;  //开始按钮
    JButton backMove;   //悔棋按钮
    JButton giveUp; //认输按钮

    JLabel bootAvatar;  //电脑头像
    JLabel bootName;    //电脑名称
    JLabel playerAvatar;  //玩家头像
    JLabel playerName;  //用户名
    JLabel playerLevel; //用户等级
    JLabel playerGender;    //用户性别

    public void init(){
        startGame = new JButton("开始");
        backMove = new JButton("悔棋");
        giveUp = new JButton("认输");

        bootAvatar = new JLabel();
        bootName = new JLabel("电脑");
        playerAvatar = new JLabel();
        playerName = new JLabel();
        playerLevel = new JLabel();
        playerGender = new JLabel();

        chessBoard = new JPanel(){
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                for(int i = 0;i < 23;i++){
                    for(int j = 0 ; j < 20 ;j++){
                        g.drawRect(30+j*30,50+i*30,30,30);
                    }
                }

            }
        };
        this.add(chessBoard);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
            }
        });

        this.setSize(800,800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

    }
}
class Main{
    public static void main(String[] args) {
        new ChessGame().init();
    }
}
