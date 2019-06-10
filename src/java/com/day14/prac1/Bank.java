package com.day14.prac1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bank {
    String account;
    int pass;
    public Bank (String a,int p){
        this.account = a;
        this.pass = p;
    }
    private void checkAccount()throws Exception{
        //12-21
        // 要验证的字符串
        //String str = String.valueOf(account);
        // 邮箱验证规则
        //String regEx = "[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}";
        // 编译正则表达式
        String regEx = "[0-9]{12,21}";
        Pattern pattern = Pattern.compile(regEx);
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(account);
        // 字符串是否与正则表达式相匹配
        if(!matcher.matches()){
           throw new Exception("账号格式布正确");
        }
    }
    private void checkPass()throws Exception{
        //6
        String str = String.valueOf(pass);
        String regEx = "[0-9]{6}";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(str);
        // 字符串是否与正则表达式相匹配
        if(!matcher.matches()){
           throw new Exception("密码格式不合格");
        }
    }
    public void check(){
        try {
            checkAccount();
            checkPass();
            System.out.println("账号密码合格");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
class test{
    public static void main(String[] args) {
        new Bank("111111111111",111111).check();

    }
}
