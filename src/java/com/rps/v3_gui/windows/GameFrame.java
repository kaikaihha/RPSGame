package com.rps.v3_gui.windows;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {


    private int pF;
    private int bF;

    private JButton qBtn;
    private JButton jBtn;
    private JButton bBtn;
    private JButton restartBtn;
    private JButton gameOverBtn;

    private JLabel playerAvatar;
    private JLabel bootAvatar;

    private JLabel pFist;
    private JLabel bFist;

    private JLabel result;

    private JLabel img_vs;
    private JLabel img_two;

    public int getpF() {
        return pF;
    }

    public void setpF(int pF) {
        this.pF = pF;
    }

    public void init(){
        this.setResizable(false);
        this.setTitle("猜拳游戏");
        this.setLayout(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550,500);

        playerAvatar = new JLabel(new ImageIcon("src/java/com/rps/v3_gui/img/player.png"));
        playerAvatar.setBounds(27,40,85,80);
        this.add(playerAvatar);

        bootAvatar = new JLabel(new ImageIcon("src/java/com/rps/v3_gui/img/boot.png"));
        bootAvatar.setBounds(420,40,85,80);
        this.add(bootAvatar);

        img_vs = new JLabel(new ImageIcon("src/java/com/rps/v3_gui/img/vs1.png"));
        img_vs.setBounds(230,45,70,45);
        this.add(img_vs);

        img_two = new JLabel(new ImageIcon("src/java/com/rps/v3_gui/img/vs.png"));
        img_two.setBounds(125,255,330,190);
        this.add(img_two);

        pFist = new JLabel(new ImageIcon("src/java/com/rps/v3_gui/img/q.png"));
        pFist.setBounds(125,46,50,50);
        this.add(pFist);

        bFist = new JLabel(new ImageIcon("src/java/com/rps/v3_gui/img/q.png"));
        bFist.setBounds(350,46,50,50);
        this.add(bFist);

        result = new JLabel(new ImageIcon("src/java/com/rps/v3_gui/img/z.png"));
        result.setBounds(160,130,230,125);
        this.add(result);
        //*******************************************************

        qBtn = new JButton(new ImageIcon("src/java/com/rps/v3_gui/img/q.png"));
        qBtn.setBounds(40,150,50,50);
        this.add(qBtn);

        jBtn = new JButton(new ImageIcon("src/java/com/rps/v3_gui/img/j.png"));
        jBtn.setBounds(40,260,50,50);
        this.add(jBtn);

        bBtn = new JButton(new ImageIcon("src/java/com/rps/v3_gui/img/b.png"));
        bBtn.setBounds(40,370,50,50);
        this.add(bBtn);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
        registActionlistenner();
    }

    public void setImg(JLabel jLabel,ImageIcon img){
        jLabel.setIcon(img);
    }

    public void registActionlistenner(){
        qBtn.addActionListener(this);
        jBtn.addActionListener(this);
        bBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton)e.getSource();
        if(qBtn==jButton){
            this.setImg(pFist,new ImageIcon("src/java/com/rps/v3_gui/img/q.png"));
            pF = 1;
            bootShow();
            showResult();
        }else if(jBtn==jButton){
            this.setImg(pFist,new ImageIcon("src/java/com/rps/v3_gui/img/j.png"));
            pF = 2;
            bootShow();
            showResult();
        }else if(bBtn==jButton){
            this.setImg(pFist,new ImageIcon("src/java/com/rps/v3_gui/img/b.png"));
            pF = 3;
            bootShow();
            showResult();
        }
    }

    public void bootShow(){
        bF = 1+(int)(Math.random()*10)%3;
        if(bF==1){
            this.setImg(bFist,new ImageIcon("src/java/com/rps/v3_gui/img/q.png"));
        }else if(bF==2){
            this.setImg(bFist,new ImageIcon("src/java/com/rps/v3_gui/img/j.png"));
        }else if(bF==3){
            this.setImg(bFist,new ImageIcon("src/java/com/rps/v3_gui/img/b.png"));
        }
    }

    public void showResult(){
        if((pF==1&&bF==1)||(pF==2&&bF==2)||(pF==3&&bF==3)){
            setImg(result,new ImageIcon("src/java/com/rps/v3_gui/img/z.png"));
        }else if((pF==1&&bF==2)||(pF==2&&bF==3)||(pF==3&&bF==1)){
            setImg(result,new ImageIcon("src/java/com/rps/v3_gui/img/w.png"));
        }else if((pF==2&&bF==1)||(pF==3&&bF==2)||(pF==1&&bF==3)){
            setImg(result,new ImageIcon("src/java/com/rps/v3_gui/img/h.png"));
        }
    }


}
class Main{
    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        gameFrame.init();



    }
}
