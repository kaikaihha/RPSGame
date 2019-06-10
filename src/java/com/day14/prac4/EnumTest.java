package com.day14.prac4;

public class EnumTest {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(Season.SPRING.getName());
    }
}
enum Season implements info{
    SPRING("春天","春风又绿江南岸"),
    SUMMER("夏天","映日荷花别样红"),
    AUTUMN("秋天","秋水共长天一色"),
    WINTER("冬天","窗含西岭千秋雪");
    private String name;
    private String discrap;
    private Season(String name,String disrap){
        this.name = name;
        this.discrap = disrap;
    }

    @Override
    public String getName() {
        return name;
    }
}
interface info{
    public String getName();
}
