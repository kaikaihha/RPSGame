package com.rps.v3_gui_oop_io.windows;

import javax.swing.*;
import java.awt.*;

public class Start extends JFrame {
    private JButton button;
    public void init() {

        this.setSize(550, 500);
        button = new JButton("5");
        //button.setFont(new Font("", Font.BOLD, 208));
        this.add(button); // 启动
        ButtonAction t = new ButtonAction();
        t.start();
        //this.setUndecorated(true);// 隐藏最大化最小化那一栏
        this.setAlwaysOnTop(true);// 窗口始终在最顶上
        this.setDefaultCloseOperation(0);//防止按Alt+F4关闭
        //设置窗口出现的位置
        this.setLocationRelativeTo(null);// 设置居中
        this.setVisible(true);
    }
    class ButtonAction extends Thread {
        int num = 6;
        @Override public void run() {
            while (num != 0) {
                try {
                    num--;
                    button.setText(num + "");
                    sleep(1000);
                } catch (Exception e) {

                }
            }
        }
    }
}
