package com.day14.prac2;

public class Proxy {
    private long time;
    private long memory;

    public void run(){
        time();
        memory();
    }

    private void time(){
        long startTime = System.nanoTime();
        new Test().loop();
        time = System.nanoTime() - startTime;
    }
    private void memory(){
        long totalM = Runtime.getRuntime().totalMemory()/1024/1024;//所有内存
        long freeMBefore = Runtime.getRuntime().freeMemory()/1024/1024;//使用前空余内存
        System.out.println(freeMBefore);
        new Test().loop();
        memory = Runtime.getRuntime().freeMemory()/1024/1024 - freeMBefore;//
    }

    public long getTime() {
        return time;
    }
    public long getMemory() {
        return memory;
    }
}
class t{
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.run();
        System.out.println("时间："+proxy.getTime()+"\n内存"+proxy.getMemory());
    }
}
