package com.infocore.java;

/**
 * @author XiangZhang
 * @date 2020/6/9 - 19:17
 */
public class ClinitTest {

    //任何一个类声明以后，内部至少存在一个类的构造器

    private int a = 1;

    //如果该类中没有静态代码块也没有声明静态的变量，所以没有<clinit>()

    private static int c = 3;//如果加上了这个，那么该类就会有<clinit>()

    public static void main(String[] args) {
        int b = 2;
    }

    public ClinitTest(){
        a = 10;
        int d = 20;
    }


}
