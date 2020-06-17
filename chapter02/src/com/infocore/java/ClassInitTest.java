package com.infocore.java;

/**
 * @author XiangZhang
 * @date 2020/6/9 - 19:04
 */
public class ClassInitTest {


    private static int num = 1;

    static {
        num = 2;
        number = 20;
        System.out.println(num);
//        System.out.println(number);//报错 Illegal forward reference  非法的前向引用。
        //因为声明的变量是在静态代码块之后，所以不可以调用这个变量，但是是可以给这个变量进行赋值的
    }


    private static int number = 10;//linking之prepare的时候 number已经被赋值为0了（默认初始化number = 0）  --> initial: 20 --> 10

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);//2
        System.out.println(ClassInitTest.number);//10
    }



}
