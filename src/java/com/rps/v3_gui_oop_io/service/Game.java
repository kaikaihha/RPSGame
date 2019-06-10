package com.rps.v3_gui_oop_io.service;

public interface Game {
    int judge(int pF, int bF);
    int judgeLastResult();
    void write(String message);
    String read();
}
