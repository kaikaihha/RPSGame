package com.day11.prac0.gui;

import javax.swing.*;
import java.awt.*;

public class Gui1 {
    public static void main(String[] args) {
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)screensize.getWidth();
        int height = (int)screensize.getHeight();

        JFrame jFrame = new JFrame();
        jFrame.setSize(600,600);
        jFrame.setTitle("猜拳游戏");
        ImageIcon imageIcon = new ImageIcon("src/java/com/day11/prac0/img/game.png");
        jFrame.setIconImage(imageIcon.getImage());

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        jFrame.setLocationByPlatform(true);
//        jFrame.setLocation(width/2,height/2);

        //jFrame.getContentPane().setBackground(Color.RED);//背景颜色

        jFrame.setResizable(false);//大小不可更改

        //设置背景图片
        JLabel lbBg = new JLabel(imageIcon);
        lbBg.setBounds(0, 0, JFrame.WIDTH, JFrame.HEIGHT);
        jFrame.getContentPane().add(lbBg);

        //添加图片
        JLabel jl3=new JLabel(imageIcon);
        jFrame.add(jl3);
        jl3.setBounds(0, 0, 700, 500);

        //按钮
        JButton jButton = new JButton("按钮");
        jButton.setSize(50,50);
        jFrame.getContentPane().add(jButton);

        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
