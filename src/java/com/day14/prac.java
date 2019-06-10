package com.day14;

import java.io.Serializable;
import java.util.*;
import static java.util.Arrays.toString;

public class prac {

}

/**
 * 1.
 * 三目运算符的类型问题。
 *
 * 会自动类型转换
 */
class Test1 {
    public static void main(String[] args) {
        char x = 'X';
        int i = 0;
        System.out.println(true ? x : 0);
        System.out.println(true ? x : 65536);
        System.out.println(true ? x : i);
        System.out.println(false ? 0 : x);
        System.out.println(false ? i : x);
    }
}

/**
 * 2.
 * 五天工作制变六天,下面代码有问题吗?
 * asList返回的List是Array中的实现的
 *  内部类,而该类并没有定义add和remove方法.另外,为什么修改其中一个,另一个也自动
 *  获得更新了,因为asList获得List实际引用的就是数组
 */
enum Week{Sun, Mon, Tue, Wed, Thu, Fri, Sat}
class Test2 {
    public static void main(String[]args){
        //五天工作制
        Week[]workDays={Week.Mon, Week.Tue, Week.Wed, Week.Thu, Week.Fri};
        //转换为列表
        List<Week> list= Arrays.asList(workDays);

        //修改
        List<Week> weekList = new ArrayList<>();
        for (Week x:workDays
             ) {
            weekList.add(x);
        }
        // 增加周六也为工作日
        list.add(Week.Sat);
        weekList.add(Week.Sat);//修改
        /*工作日开始干活了*/
        for (Week x:list) {
            System.out.println(x);
        }
    }
}
/**
 * 3.整数包装类对象比较
 * java在编译Integer i = 100 ;时，会翻译成为Integer i = Integer.valueOf(100)；，而java API中对Integer类型的valueOf的定义如下：
 * public static Integer valueOf(int i){
 *     assert IntegerCache.high >= 127;
 *     if (i >= IntegerCache.low && i <= IntegerCache.high){
 *         return IntegerCache.cache[i + (-IntegerCache.low)];
 *     }
 *     return new Integer(i);
 * }
 *java对于-128到127之间的数，会进行缓存，Integer i = 127时，会将127进行缓存，下次再写Integer j = 127时，就会直接从缓存中取，就不会new了。
 */
class Test3 {
    public static void main(String[] args) {
        Integer one=128;
        Integer two=128;
        System.out.println(one == two);
        Integer one2=100;
        Integer two2=100;
        System.out.println(one2 == two2);
    }
}

/**
 *4.为什么显示剩余金额很奇怪？
 * https://www.cnblogs.com/doudouxiaoye/p/5693434.html
 */
class Test4 {
    public static void main(String[] args) {
        Float totalMoney = 20000.8f;
        Float ownMoney = 17000.5f;
        Float leftMoney = totalMoney - ownMoney;
        System.out.println("剩余金额:"+leftMoney);
    }
}

/**
 * 5.instanceof判断类型，分别输出什么？
 * instanceof的理解https://www.cnblogs.com/zjxynq/p/5882756.html
 */
class Test5 {
    public static void main(String[] args) {
        Object hello="hello";
        System.out.println(">>1:"+(hello instanceof Object));
        System.out.println(">>2:"+(hello instanceof String));
        Math math =(Math)hello;
        System.out.println(">>3:"+(math instanceof Math));
        System.out.println(">>4:"+(hello instanceof Comparable));//比较器接口
        System.out.println(">>4:"+(null instanceof Object));
        System.out.println(">>5:"+(hello instanceof Serializable));//序列化接口
    }
}

/**
 * 6.运行结果:Double array
 * 原因：
 */
class Test6 {
    public static void main(String[] args) {
        new Test6(null);
    }
    private Test6(Object o) {
        System.out.println("Object");
    }
    private Test6(double[] doubleArray) {
        System.out.println("Double array");
    }
}

/**
 * 7.运行两遍以上的结果
 *不含参构造方法每次都使用当前时间作为种子，而含参构造方法是以一个固定值作为种子。不含参的构造函数每次都使用当前时间作为种子，随机性更强
 * 而含参的构造函数其实是伪随机，更有可预见性。
 * 通过种子得到的随机序列时一定的。
 */
class Test7 {
    public static void main(String[] args) {
        Random r = new Random(1000);
        for (int i = 1; i < 4; i++) {
            System.out.println("第" + i + "次：" + r.nextInt());
        }
    }
}

/**
 * 8.输入2147483647后的结果
 *
 * int 最大值为2147483647，超过这个数时，会循环赋值，即从最小值开始加
 */
class Test8 {
    //一个会员拥有产品的最多数量
    public final static int LIMIT = 2000;
    public static void main(String[] args) {
        //会员当前拥有的产品数量
        int cur = 1000;
        System.out.println(Integer.MAX_VALUE);
        Scanner input = new Scanner(System.in);
        System.out.print("请输入需要预定的数量：");
        while (input.hasNextInt()) {
            int order = input.nextInt();
            System.out.println(order + cur);
            // 当前拥有的与准备订购的产品数量之和
            if (order > 0 && order + cur <= LIMIT) {
                System.out.println("你已经成功预定的" + order + "个产品！");
            } else {
                System.out.println("超过限额，预订失败！");
            }
        }
    }
}

/**
 * 9.输出结果：White
 * 静态类优先于于静态属性
 */

class X {
    static class Y {
        static String Z = "Black";
    }
    static C Y = new C();
}
class C {
    String Z = "White";
}
class Test9 {
    public static void main(String[] args) {
        System.out.println(X.Y.Z);
    }
}

/**
 *10.输出结果 value is Hello
 */
class Test10 {
    public static void main(String[] args) {
        StringBuffer  s = new  StringBuffer("Hello");
        if((s.length()>5) &&(s.append("there").equals("False"))) ;
        System.out.println("value  is "+s);
    }
}

/**
 * 11.输出结果
 * 静态方法没有重写
 */
class Dog{
    public static void bark(){
        System.out.print("woof \n");
    }
}
class Basenji extends Dog{
    public static void bark(){
        System.out.println("...");
    }
}
class Test11{
    public static void main(String[] args) {
        Dog woofer = new Dog();
        Dog nipper = new Basenji();
        woofer.bark();
        nipper.bark();
        Basenji.bark();
    }
}
/**
 * 12.结果 1234 参数传递，普通的值传递的时数值，并不会改变原变量的值。
 */
class Test12 {
    public static void changeStr(String str){
        str="welcome";
    }
    public static void main(String[] args) {
        String str="1234";
        changeStr(str);
        System.out.println(str);
    }
}

/**
 * 13.期望打印输出给定的数组,能打印吗？答：不能
 * 非静态方法toString不能再静态上下文中调用
 */
class Test13{
    public static void main(String[] args){
        printArgs(1, 2, 3, 4, 5);
    }
    static void printArgs(Object... args){
        //System.out.println(toString(args));
        System.out.println(Arrays.toString(args));
    }
}

/**
 *14.输出结果： int 版本被调用
 * 因为1默认是int类型，所以首先调用int参数的方法
 *
 */
class Test14 {
    public static void main(String[] args) {
        someMethod(1);
    }
    public static void someMethod(int i){
        System.out.println("int 版本被调用");
    }
    public static void someMethod(Integer i){
        System.out.println("Integer 版本被调用");
    }
}

/**
 * 15.输出结果
 * 报 java.lang.RuntimeException: 运行时异常
 *
 */
class Test15 extends Throw {
    void myThow()
        /* throws 表达式 */ {
            try {
                myThow_1(7, 0);
            } catch (ArithmeticException e) {
                System.out.println();
            } throw new RuntimeException("运行时异常");
        }
        public static void main(String[] args) {
            new Test15().myThow();
        }
}
class Throw {
    void myThow() throws ArithmeticException, InterruptedException {
        myThow_1(3, 6);
    }
    int myThow_1(int x, int y) throws ArithmeticException {
        return x / y;
    }
}



