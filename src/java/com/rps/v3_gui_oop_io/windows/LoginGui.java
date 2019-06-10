package com.rps.v3_gui_oop_io.windows;

import javax.swing.*;
import java.awt.event.*;

public class LoginGui {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton 登录Button;
    private JButton 重置Button;
    private JPanel login;
    private JPanel buttons;
    JFrame frame = null;

    String userName;
    String userPass;

    public LoginGui() {
        frame = new JFrame("LoginGui");
        登录Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("用户账号："+textField1.getText());
                System.out.println("用户密码："+passwordField1.getText());
                Start s = new Start();
                s.init();
                try {
                    Thread.sleep(5000);
                    s.dispose();
                    frame.dispose();
                } catch (InterruptedException i) {
                    i.printStackTrace();
                }
                new RPSFrame().init(textField1.getText(),passwordField1.getText());
            }
        });
        重置Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                passwordField1.setText("");
            }
        });
    }

    public void init(){
        frame.setContentPane(new LoginGui().login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
