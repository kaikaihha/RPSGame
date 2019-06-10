package com.day18;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class prac2 {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        readFile.read();
        readFile.judge();
        readFile.result();
    }
}
class ReadFile {
    private List<String> chuqin = new ArrayList<>();
    private List<String> yuangong = new ArrayList<>();

    public void read() throws IOException {
        readfile("C:\\Users\\KaiKai\\Desktop\\代码项目包\\版本1.猜拳游戏 单类实现\\RPSGame\\src\\java\\com\\day18\\txts\\chuqin");
        readfile("C:\\Users\\KaiKai\\Desktop\\代码项目包\\版本1.猜拳游戏 单类实现\\RPSGame\\src\\java\\com\\day18\\txts\\yuangong");
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
    /**
     * 读取某个文件夹下的所有文件
     */
    public boolean readfile(String filepath) throws FileNotFoundException, IOException {
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {

            File file = new File(filepath);
            if (!file.isDirectory()) {
//                System.out.println("文件");
//                System.out.println("path=" + file.getPath());
//                System.out.println("absolutepath=" + file.getAbsolutePath());
//                System.out.println("name=" + file.getName());

            } else if (file.isDirectory()) {
                //System.out.println("文件夹");
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    File readfile = new File(filepath + "\\" + filelist[i]);
                    if (!readfile.isDirectory()) {
//                        System.out.println("path=" + readfile.getPath());
//                        System.out.println("absolutepath="
//                                + readfile.getAbsolutePath());
//                        System.out.println("name=" + readfile.getName());

                        fileReader = new FileReader(readfile);
                        bufferedReader = new BufferedReader(fileReader);
                        String str = null;
                        while ((str = bufferedReader.readLine())!=null){
                            System.out.print(str+"、");
                            //stringBuffer.append(str);
                            if(filepath.equals("C:\\Users\\KaiKai\\Desktop\\代码项目包\\版本1.猜拳游戏 单类实现\\RPSGame\\src\\java\\com\\day18\\txts\\chuqin")){
                                chuqin.add(str);
                            }else if(filepath.equals("C:\\Users\\KaiKai\\Desktop\\代码项目包\\版本1.猜拳游戏 单类实现\\RPSGame\\src\\java\\com\\day18\\txts\\yuangong")){
                                yuangong.add(str);
                            }
                        }
                        System.out.println();

                    } else if (readfile.isDirectory()) {
                        readfile(filepath + "\\" + filelist[i]);
                    }
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("readfile()   Exception:" + e.getMessage());
        }
        return true;
    }
}