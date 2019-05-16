package com.day3;

public class SumOdd {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i <= 1000;i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        System.out.println("1-1000奇数和为："+sum);

        sevenSum();
        shuixianhua();
        System.out.println("**************************");
        xixuegui();
    }

    /**
     * 判断奇偶
     * @param num
     * @return
     */
    public static boolean isOdd(int num){
        return (num&1)==1;
    }


    public static void sevenSum(){
        System.out.println("********************");
        int counter = 0;
        int sum = 0;
        for(int i=1;i<10000;i++){
            if(i%7==0){
                counter++;
                sum+=i;
            }
        }
        System.out.println("1-10000是7的倍数个数为："+counter+"\t和为："+sum);
    }

    public static void shuixianhua(){
        System.out.println("************************");
        System.out.println("水仙花数");
        int counter = 0;
        for(int i=100;i<1000;i++){
            if(i==(((i%10)*(i%10)*(i%10))+((i/10%10)*(i/10%10*(i/10%10)))+((i/100)*(i/100)*(i/100)))){
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("共有"+counter+"个水仙花数");
    }

    /**
     * 吸血鬼数：1260=21*60
     */
    public static void xixuegui(){
        for(int i = 1000;i<10000;i++){
            char[] four = String.valueOf(i).toCharArray();
            String a = String.valueOf(four[0]);
            String b = String.valueOf(four[1]);
            String c = String.valueOf(four[2]);
            String d = String.valueOf(four[3]);
            if(i==(Integer.valueOf((a+b))*Integer.valueOf(c+d))){
                System.out.println("吸血鬼数："+i+"="+a+b+"*"+c+d);
            }else if(i==(Integer.valueOf((a+b))*Integer.valueOf(d+c))){
                System.out.println("吸血鬼数："+i+"="+a+b+"*"+d+c);
            }else if(i==(Integer.valueOf((b+a))*Integer.valueOf(c+d))){
                System.out.println("吸血鬼数："+i+"="+b+a+"*"+c+d);
            }else if(i==(Integer.valueOf((b+a))*Integer.valueOf(d+c))){
                System.out.println("吸血鬼数："+i+"="+b+a+"*"+d+a);
            }else if(i==(Integer.valueOf((a+c))*Integer.valueOf(b+d))){
                System.out.println("吸血鬼数："+i+"="+a+c+"*"+b+d);
            }else if(i==(Integer.valueOf((a+c))*Integer.valueOf(d+b))){
                System.out.println("吸血鬼数："+i+"="+a+c+"*"+d+b);
            }else if(i==(Integer.valueOf((c+a))*Integer.valueOf(b+d))){
                System.out.println("吸血鬼数："+i+"="+c+a+"*"+b+d);
            }else if(i==(Integer.valueOf((c+a))*Integer.valueOf(d+b))){
                System.out.println("吸血鬼数："+i+"="+c+a+"*"+d+b);
            }else if(i==(Integer.valueOf((a+d))*Integer.valueOf(b+c))){
                System.out.println("吸血鬼数："+i+"="+a+d+"*"+b+c);
            }else if(i==(Integer.valueOf((a+d))*Integer.valueOf(c+b))){
                System.out.println("吸血鬼数："+i+"="+a+d+"*"+c+b);
            }else if(i==(Integer.valueOf((d+a))*Integer.valueOf(b+c))){
                System.out.println("吸血鬼数："+i+"="+d+a+"*"+b+c);
            }else if(i==(Integer.valueOf((d+a))*Integer.valueOf(c+b))){
                System.out.println("吸血鬼数："+i+"="+d+a+"*"+c+b);
            }
        }
    }


}
