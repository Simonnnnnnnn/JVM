package com.infocore.java3;

/**
 *
 * 问题：
 *      方法中定义的局部变量是否线程安全？
 *      具体问题具体分析
 *
 *  何为线程安全？
 *      如果只有一个线程才可以操作此数据，则必是线程安全的
 *      如果有多个线程操作此数据，则此数据是共享数据。如果不考虑同步机制的话，会存在线程安全问题
 * @author XiangZhang
 * @date 2020/6/12 - 20:53
 */
public class StringBuilderTest {


    //s1的声明方式是线程安全的，栈帧只被当前线程所使用，所以是线程安全的，其他线程无法调用这个线程的栈帧
    public static void method1(){
//        StringBuilder:线程不安全
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        //.....
    }

    //stringBuilder的操作过程：是线程不安全的，因为这个形参是外面传进来的，所以他还有可能被别的线程所调用
    public static void method2(StringBuilder stringBuilder){
        stringBuilder.append("a");
        stringBuilder.append("b");
        //.....
    }

    //s1的操作：是线程不安全的，因为将这个s1返回了，返回之后有可能被其他线程调用
    public static StringBuilder method3(){
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1;
    }

    //s1的操作：是线程安全的 因为在s1已经消亡了，但是这个返回的String可能是线程不安全的，也有可能被其他线程调用
    //总结：变量是在内部产生，内部消亡的，就是线程安全的。
    public static String method4(){
        StringBuilder s1 = new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1.toString();
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();

        new Thread(()->{
            s.append("a");
            s.append("b");
        }).start();

        method2(s);


    }


}
