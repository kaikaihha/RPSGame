package com.rps.v3_gui_oop_io.util;

import java.util.*;


public class StringUtil{
    Map<Integer,String> map = new HashMap<Integer, String>();

    public String strDivideSort(String str){
        String[] strings = str.split("#");
        String[] temp = null;
        for (String x: strings){
            temp = x.split("%");
            String score = temp[temp.length-1];
            map.put(Integer.valueOf(score),x);
        }
        List<Map.Entry<Integer,String>> list = new ArrayList<Map.Entry<Integer,String>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        for(Map.Entry<Integer,String> mapping:list){
            stringBuffer.append(mapping.getValue());
            stringBuffer.append("\n");
        }
        return String.valueOf(stringBuffer);
    }
}
