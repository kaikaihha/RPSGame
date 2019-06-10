package com.rps.v3_gui_oop_io.pojo.impl;

import com.rps.v3_gui_oop_io.pojo.User;

public class Boot extends User {
    @Override
    public void showFist() {
        this.fist=1+(int)(Math.random()*10)%3;
    }
}
