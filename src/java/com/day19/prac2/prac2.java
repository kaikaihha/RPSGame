package com.day19.prac2;
import java.util.*;
public class prac2 {
    public void qc(){
        List<String> list1 = new ArrayList<String>(){{
            add("a");
            add("b");
            add("c");
            add("d");
            add("e");
        }};
        List<String> list2 = new ArrayList<String>(){{
            add("d");
            add("e");
            add("f");
            add("g");
            add("h");
        }};
        list1.removeAll(list2);
        list1.addAll(list2);
        for (String x:list1
             ) {
            System.out.println(x);
        }
    }
    public void extend(){//65-90  97-122
        List<String> list = new ArrayList<String>();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0;i<10000;i++){
            int a = (int)(2+Math.random()*(8-2+1));
            for (int j = 0;j < a;j++){
                stringBuffer.append((Math.random()>0.5)?((char)(65+Math.random()*(90-65+1))):((char)(97+Math.random()*(122-97+1))));
            }
            list.add(stringBuffer.toString());
            stringBuffer.setLength(0);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        Set<String> stringSet = new HashSet<String>();
        int flag = 1;
        for (String x:list
             ) {
            if(!stringSet.add(x)){
               if(++flag == 3){
                   System.out.println(x);
               }
            }else {
                flag = 1;
            }
        }
    }
}
class t{
    public static void main(String[] args) {
        //new prac2().qc();
        new prac2().extend();
    }
}
