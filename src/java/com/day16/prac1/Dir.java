package com.day16.prac1;

import java.io.File;

public class Dir {
    public static void main(String[] args) {
        if (args.length >= 2){
            String cmdName = args[0];
            String path = args[2];
            File file = new File(path);
            String fileName = file.getName();
            long len = file.length();
            long lastModified = file.lastModified();
            String[] list = file.list();
        }else {
            System.out.println("输入参数!");
        }
    }
}
