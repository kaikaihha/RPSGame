package com.day18;

import com.day9.prac2.Str;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class prac1 {
    private List<String> chuqin = new ArrayList<>();
    private List<String> yuangong = new ArrayList<>();
    public void read(String path){
        System.out.print("读取数据:\t");
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            File file = new File(path);
            if(!file.exists()){
                System.out.println("文件不存在");
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = null;
            //StringBuffer stringBuffer = new StringBuffer();
            while ((str = bufferedReader.readLine())!=null){
                System.out.print(str+"、");
                //stringBuffer.append(str);
                if(path.equals("C:\\Users\\KaiKai\\Desktop\\代码项目包\\版本1.猜拳游戏 单类实现\\RPSGame\\src\\java\\com\\day18\\txt\\chuqin.txt")){
                    chuqin.add(str);
                }else if(path.equals("C:\\Users\\KaiKai\\Desktop\\代码项目包\\版本1.猜拳游戏 单类实现\\RPSGame\\src\\java\\com\\day18\\txt\\yuangong.txt")){
                    yuangong.add(str);
                }
            }
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void judge(){
        Iterator<String> iterator = yuangong.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            for (String x : chuqin) {
                if (s.equals(x)) {
                    iterator.remove();
                }
            }
        }
    }
    public void result(){
        System.out.print("缺勤名单:\t");
        for (String x : yuangong) {
            System.out.print(x+"、");
        }
    }
}
class t{
    public static void main(String[] args) {
        prac1 p = new prac1();
        p.read("C:\\Users\\KaiKai\\Desktop\\代码项目包\\版本1.猜拳游戏 单类实现\\RPSGame\\src\\java\\com\\day18\\txt\\yuangong.txt");
        p.read("C:\\Users\\KaiKai\\Desktop\\代码项目包\\版本1.猜拳游戏 单类实现\\RPSGame\\src\\java\\com\\day18\\txt\\chuqin.txt");
        p.judge();
        p.result();
    }
}
