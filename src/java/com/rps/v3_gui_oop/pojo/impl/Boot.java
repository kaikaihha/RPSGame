package com.rps.v3_gui_oop.pojo.impl;

import com.rps.v3_gui_oop.pojo.User;

public class Boot extends User {
    @Override
    public void showFist() {
        this.fist=1+(int)(Math.random()*10)%3;
    }
}
