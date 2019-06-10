package com.day19.prac3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class prac3 {
    List<Integer> list = new ArrayList<Integer>();
    public void createNum(){
        int temp = 0;
        for(int i = 0;i < 10;i++){
            while (true){
                temp = (int)(1+Math.random()*50);
                if(temp%2 == 0){
                    list.add(temp);
                    break;
                }
            }
        }
    }
    public void sort(){
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
    }
    public void write(){
        File file = new File("C:\\Users\\KaiKai\\Desktop\\代码项目包\\版本1.猜拳游戏 单类实现\\RPSGame\\src\\java\\com\\day19\\prac3\\num.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(list.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class t{
    public static void main(String[] args) {
        prac3 prac3 = new prac3();
        prac3.createNum();
        prac3.sort();
        prac3.write();

    }
}
