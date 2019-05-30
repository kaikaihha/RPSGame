package com.day13.prac1;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 发送消息的格式
 * @author kaikai
 *
 */
interface NewsNorm {
    public byte getType();
    public String getText();
}

/**
 * 发送文本信息
 * @author kaikai
 *
 */
class TextNews implements NewsNorm{

    private String str;
    public TextNews(String str){
        this.str = str;
    }
    public byte getType() {
        return 0;
    }
    public String getText() {
        return str;
    }

}

/**
 * 组件显示消息的接口
 * @author kaikai
 *
 */
interface ShowNews {
    public void processNews(NewsNorm n);
}

/**
 * 自定义标签组件
 * @author kaikai
 *
 */
class LableModule extends JLabel implements ShowNews{

    public void processNews(NewsNorm n) {
        String str = n.getText();
        this.setText(str);
    }

}

/**
 * 处理消息的线程
 * @author kaikai
 *
 */
class ProThread extends Thread{
    private List<ShowNews> list = new ArrayList<ShowNews>();

    public void addNewsListener(ShowNews sh){
        list.add(sh);
    }
    public void run(){
        int num = 1;
        while(true){
            String str = "消息"+num;
            for(int i=0; i<list.size(); i++){
                NewsNorm n = new TextNews(str);
                ShowNews sh = list.get(i);
                sh.processNews(n);
            }
            num ++;
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/**
 * 自定义按钮监听事件
 * @author kaikai
 *
 */
class ButtonModule extends JButton implements ShowNews{

    public void processNews(NewsNorm n) {
        String str = n.getText();
        this.setText(str);
        this.setPreferredSize(new Dimension(100,30));
    }

}

/**
 * 程序入口
 * @author kaikai
 *
 */
public class Main {

    /**
     * 主函数
     */
    public static void main(String[] args) {
        Main m = new Main();
        m.setUpFrame();
    }
    private void setUpFrame(){
        JFrame frame = new JFrame("自定义事件监听");
        frame.setSize(new Dimension(400,300));
        frame.setLayout(new FlowLayout());
        //实例化事件处理线程对象
        ProThread pr = new ProThread();
        //实例化自定义标签对象
        LableModule la = new LableModule();
        //实例化自定义按钮对象
        ButtonModule bu = new ButtonModule();

        pr.addNewsListener(bu);
        pr.addNewsListener(la);
        //启动消息处理线程
        pr.start();

        frame.add(la);
        frame.add(bu);
        frame.setVisible(true);
    }
}

