package com.day12.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private JButton up;
    private JButton down;
    private JButton first;
    private JButton end;

    private CardLayout cardLayout;

    private Panel cardPanel;
    private Panel btnPanel;

    public void init(){
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550,500);
        this.setTitle("卡牌");

        up = new JButton("上一张");
        down = new JButton("下一张");
        first = new JButton("第一张");
        end = new JButton("最后一张");

        cardLayout = new CardLayout();
        cardPanel = new Panel();

        for(int i = 1;i < 6;i++){
            cardPanel.add(new JButton("第"+i));
        }

        btnPanel = new Panel();

        cardPanel.setLayout(cardLayout);

        btnPanel.add(up);
        btnPanel.add(down);
        btnPanel.add(first);
        btnPanel.add(end);

        registActionlistenner();

        Container container = getContentPane();

        container.add(cardPanel,BorderLayout.CENTER);
        container.add(btnPanel,BorderLayout.SOUTH);

        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton)e.getSource();
        if(up==jButton){
            cardLayout.previous(cardPanel);
        }else if(down==jButton){
            cardLayout.next(cardPanel);
        }else if(first==jButton){
            cardLayout.first(cardPanel);
        }else if(end==jButton){
            cardLayout.last(cardPanel);
        }
    }

    private void registActionlistenner(){
        up.addActionListener(this);
        down.addActionListener(this);
        first.addActionListener(this);
        end.addActionListener(this);
    }
}
class test{
    public static void main(String[] args) {
        new MyFrame().init();
    }
}
