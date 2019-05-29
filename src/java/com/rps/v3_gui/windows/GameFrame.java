package com.rps.v3_gui.windows;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {


    private int playerF;
    private int bootF;

    private JButton qBtn;
    private JButton jBtn;
    private JButton bBtn;
    private JButton restartBtn;
    private JButton gameOverBtn;

    private JLabel playerAvatar;
    private JLabel bootAvatar;

    private JLabel playerFist;
    private JLabel bootFist;

    private JLabel result;

    private JLabel img_vs;
    private JLabel img_two;

    public int getPlayerF() {
        return playerF;
    }

    public void setPlayerF(int playerF) {
        this.playerF = playerF;
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

        playerFist = new JLabel(new ImageIcon("src/java/com/rps/v3_gui/img/q.png"));
        playerFist.setBounds(125,46,50,50);
        this.add(playerFist);

        bootFist = new JLabel(new ImageIcon("src/java/com/rps/v3_gui/img/q.png"));
        bootFist.setBounds(350,46,50,50);
        this.add(bootFist);

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
            this.setImg(playerFist,new ImageIcon("src/java/com/rps/v3_gui/img/q.png"));
            playerF = 1;
            bootShow();
            showResult();
        }else if(jBtn==jButton){
            this.setImg(playerFist,new ImageIcon("src/java/com/rps/v3_gui/img/j.png"));
            playerF = 2;
            bootShow();
            showResult();
        }else if(bBtn==jButton){
            this.setImg(playerFist,new ImageIcon("src/java/com/rps/v3_gui/img/b.png"));
            playerF = 3;
            bootShow();
            showResult();
        }
    }

    public void bootShow(){
        bootF = 1+(int)(Math.random()*10)%3;
        if(bootF==1){
            this.setImg(bootFist,new ImageIcon("src/java/com/rps/v3_gui/img/q.png"));
        }else if(bootF==2){
            this.setImg(bootFist,new ImageIcon("src/java/com/rps/v3_gui/img/j.png"));
        }else if(bootF==3){
            this.setImg(bootFist,new ImageIcon("src/java/com/rps/v3_gui/img/b.png"));
        }
    }

    public void showResult(){
        if((playerF==1&&bootF==1)||(playerF==2&&bootF==2)||(playerF==3&&bootF==3)){
            setImg(result,new ImageIcon("src/java/com/rps/v3_gui/img/z.png"));
        }else if((playerF==1&&bootF==2)||(playerF==2&&bootF==3)||(playerF==3&&bootF==1)){
            setImg(result,new ImageIcon("src/java/com/rps/v3_gui/img/w.png"));
        }else if((playerF==2&&bootF==1)||(playerF==3&&bootF==2)||(playerF==1&&bootF==3)){
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
