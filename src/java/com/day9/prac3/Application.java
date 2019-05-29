package com.day9.prac3;

public class Application implements Fun{
    private String name;
    private String gender;
    private int age;
    private String address;
    private String xl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl;
    }

    @Override
    public void jdwb() {
        System.out.println("简单文本输出");
    }

    @Override
    public void bg() {
        System.out.println("表格方式输出");
    }

    @Override
    public void web() {
        System.out.println("web方式输出");
    }
}
