package com.day13;

import javax.swing.*;
import java.awt.*;

public class P extends JFrame {

    private JPanel jPanel;


    public void init(){
        this.setSize(550,550);
        this .add(new MyPanel(10,10,50,50));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
class MyPanel extends JPanel{

    private int x;
    private int y;
    private int w;
    private int h;

    public MyPanel(int x,int y,int w,int h){
        setX(x);
        setY(y);
        setH(h);
        setW(w);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i=0;i<550/50;i++){
            for(int j = 0;j<550/50;j++){
                g.drawRect(getX(),getY(),getW(),getH());
                x+=50;
            }
            x=10;
            y+=50;
        }

    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
class test{
    public static void main(String[] args) {
        new P().init();
    }
}
