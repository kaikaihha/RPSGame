package com.rps.v3_gui_oop_io.service;

import com.day9.prac2.Str;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class GameImpl implements Game {

    /**
     *
     * @param pF 玩家fist
     * @param bF 电脑fist
     * @return 1和局，2玩家赢，3玩家输,0未知结果
     */
    @Override
    public int judge(int pF, int bF) {
        if((pF==1&&bF==1)||(pF==2&&bF==2)||(pF==3&&bF==3)){
            return 1;
        }else if((pF==1&&bF==2)||(pF==2&&bF==3)||(pF==3&&bF==1)){
            return 2;
        }else if((pF==2&&bF==1)||(pF==3&&bF==2)||(pF==1&&bF==3)){
            return 3;
        }else return 0;
    }

    @Override
    public int judgeLastResult() {
        return 0;
    }

    @Override
    public void write(String message) {
        System.out.println("写入数据"+message);
        try {
            File file = new File("C:\\Users\\KaiKai\\Desktop\\代码项目包\\版本1.猜拳游戏 单类实现\\RPSGame\\src\\java\\com\\rps\\v3_gui_oop_io\\note\\note.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file,true);
            fileWriter.write(message);
            fileWriter.flush();
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public String read() {
        System.out.println("读取数据");
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            File file = new File("C:\\Users\\KaiKai\\Desktop\\代码项目包\\版本1.猜拳游戏 单类实现\\RPSGame\\src\\java\\com\\rps\\v3_gui_oop_io\\note\\note.txt");
            if(!file.exists()){
                return "0";
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str = null;
            StringBuffer stringBuffer = new StringBuffer();
            while ((str = bufferedReader.readLine())!=null){
                stringBuffer.append(str);
            }
            return String.valueOf(stringBuffer);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
}
