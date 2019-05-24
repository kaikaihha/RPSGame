package com.day8.prac2;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static Map<String,Test> map = new HashMap<String,Test>();
    public static int count = 0;
    private String name;
    public static Test getTest(){
        return new Test();
    }

    private Test(){
        count++;
        setName("test"+String.valueOf(count));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
