package com.day9.prac;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int count = 0;
        count++;
        count = count++;
        System.out.println(count);
    }
}
/**
 * 示例1
 * 问题：输入非int报异常，小于20无结果，边界年龄不合实际，年龄阶段分的不细，对于年龄过大或为负不合实际无解决
 * 解决：改为switch，细化年龄阶段，增加年龄不合实际判断
 */
class IfErrorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入年龄:");
        int age = input.nextInt();
        if(age>60){
            System.out.println("老年人");
        }else if(age>40){
            System.out.println("中年人");
        }else if(age>20){
            System.out.println("青年人");
        }
    }
}
/**
 * 示例2
 * 问题：陷入死循环
 */
class ForCountTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i的值="+i);
            i *= 0.1;//自带强制类型转换
            //i=i*0.1;
        }
    }
}

/**
 * 示例3
 * count++先访问再自增
 */
class Test3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count = count++;
            //count++;
        }
        System.out.println("count=" + count);
    }
}

/**
 * 示例4
 */
class Test4{
    public static void main(String[] args) {
        System.out.println("常量值： " + Const.RAND_CONST);
    }
}/* 接口常量 */
interface Const {
    //常量？
     static final int RAND_CONST = new Random().nextInt();
}

/**
 * 示例5
 * 问题：结果不相等
 * 解决：三目运算符中参数类型一致
 */
class Test5 {
    public static void main(String[] args) {
        int i = 80;
        String s = String.valueOf(i < 100 ? 90 : 100);
        String s1 = String.valueOf(i < 100 ? 'a' : 100.0);
        //String s1 = String.valueOf(i < 100 ? 90 : 100.0);
        //String s1 = String.valueOf(i < 100 ? "iii" : 100.0);

        System.out.println(s);
        System.out.println(s1);
        System.out.println("两者是否相等： " + s.equals(s1));
    }
}

/**
 * 示例6
 * 问题：函数重载
 * 解答：
 */
class Test6 {
    public void methodA(String str, Integer... is){
        System.out.println("重载1...");
    }
    public void methodA(String str, String... strs){
        System.out.println("重载2...");
    }
    public static void main(String[] args){
        Test6 test3=new Test6();
        test3.methodA("China",0);
        test3.methodA("China", "People");
        //可变参数不能为空或不写
//        test3.methodA("China");   //找不到参数个数为一个的方法,报错
//        test3.methodA("China",null);  //找到两个可以调用的方法，报错
    }
}

/**
 * 示例7
 * 向上转型时，栈存放父类的引用，堆存放子类的示例对象，当父类引用调用父类方法时，会先调用父类中的方法并将参数传递给父类方法，接着发生动态绑定。子类默认继承了父类所有的非私有方法。
 */
class Base {//基类
    void fun(int price, int... discounts) {
        System.out.println("Base……fun");
    }
}
class Sub extends Base {// 子类,覆写父类方法
    void fun(int price, int[] discounts) {
        System.out.println("Sub……fun");
    }
}
class Test7 {
    public static void main(String[] args) {
        Base base = new Sub();// 向上转型
        base.fun(100, 50);
        Sub sub = new Sub();// 不转型
        sub.fun(100, new int[]{50});
        //sub.fun(100, 50);

    }
}

/**
 * 示例8
 */
class Test8 {
    public static void main(String[] args) {
        ImplInterface.ts.methodTS();// 调用接口的实现
    }
}
//被实现的接口
interface ITest {
    public void methodTS();
}
// 在接口中存在实现代码
interface ImplInterface {
    public static final ITest ts = new ITest() {
        public void methodTS() {
            System.out.println("我在接口中实现了");
        }
    };
}

/**
 * 示例9
 */
class Test9 {

    static {
        i = 100;
    }
    public static int i = 1;
    public static void main(String[] args) {
        System.out.println(i);
    }
}

/**
 * 示例10
 * 静态方法属于类，不会被重写；非静态方法则会
 */
class Test10 {
    public static void main(String[] args) {
        Father base = new Son();// 调用非静态方法
        base.notStatic();// 调用静态方法
        base.doTest();
    }
}
class Father {// 父类静态方法
    public static void doTest() {
        System.out.println("我是父类静态方法");
    }
    public void notStatic() { // 父类非静态方法
        System.out.println("我是父类非静态方法");
    }
}
class Son extends Father { // 子类同名、同参数的静态方法
    public static void doTest() {
        System.out.println("我是子类静态方法");
    }
    public void notStatic() {// 覆写父类的非静态方法
        System.out.println("我是子类非静态方法");
    }
}
/**
 * 示例11
 * 栈溢出，陷入死循环
 */
class Test11 {
    public static void main(String[] args) {
        Son1 s = new Son1();
        s.test();
    }
}
class FatherA {// 父类
    FatherA() {
        new Other();
    }
}
class Son1 extends FatherA {// 子类
    public void test() {
        System.out.println("Hi, show me test");
    }
}
class Other {// 相关类
    public Other() { new Son1(); }
}

/**
 * 示例12
 * finally如果有return，可能会让抛出的异常无效
 */
class Test12 {
    public static void main(String[] args) {
        try {
            doStuff(-1);
            doStuff(100);
        } catch (Exception e) {
            System.out.println("程序到这里结束");
        }
    }
    public static int doStuff(int _p) throws Exception {
        try {
            if (_p < 0) {
                throw new Exception("数据格式错误");
            } else { return _p; }
        } catch (Exception e) { throw e;
        } finally { return -1; }
    }
}

/**
 * 示例13
 * 汉字根据其编码排序
 */
class Test13 {
    public static void main(String[] args) {
        String[] strs = { "张三(Z)", "王五(W)" , "李四(L)"};
// 排序,默认是升序
        int z = (char)'张';
        int w = (char)'王';
        int l = (char)'李';
        ;

        System.out.println(""+z+","+w+","+l);
        Arrays.sort(strs);
        int i = 0;
        for (String str : strs) {
            System.out.println((++i) + "、 " + str);
        }
    }
}

/**
 * 示例14
 * 尽量不要在构造函数中抛出异常
 *
 */
class Test14 {
    public static void main(String[] args) {
        Person p = new Person(19);
        p.seeMovie();
    }
}
class Person {
    public Person(int _age) {
        if (_age < 18) {
            throw new RuntimeException("年龄必须大于18岁。 ");
        }
    }
    public void seeMovie() {
        System.out.println("看限制级电影");
    }
}

/**
 * 示例15
 *
 */
class Test15 {
    public static void main(String[] args) {
        try{
            DBBase base=new MySQLDB();
        }catch(IOException e){ //异常处理
        } catch (Exception e) { e.printStackTrace(); }
    }
}
class DBBase {// 父类
    // 父类抛出IOException
    public DBBase() throws IOException {
        throw new IOException();
    }
}
class MySQLDB extends DBBase {// 子类
    // 子类抛出Exception异常
    public MySQLDB () throws Exception { }
}


