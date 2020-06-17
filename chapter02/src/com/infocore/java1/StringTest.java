package com.infocore.java1;

/**
 * @author XiangZhang
 * @date 2020/6/10 - 15:49
 */
public class StringTest {

    public static void main(String[] args) {
        java.lang.String str = new java.lang.String();
        //自定义String类的静态代码块没有执行，说明此时String用的还是java的核心类库中的，不是自定义的String类
        //这个类加载需要使用系统类加载器，系统类加载器会委托它的父加载器扩展类加载器，扩展类加载器会委托它的父类加载器引导类加载器
        //引导类加载器一看它的包是java.lang，而引导类加载器是加载java、javax、sun等开头的类，所以引导类加载器就加载了java核心类库下的String
        //一旦父类加载器完成加载之后，就不会向下委托了
        //所以我们上面new出来的对象其实是java核心类库中的String，而不是自定义String类
        System.out.println("hello,infocore.com");

        StringTest test = new StringTest();
        System.out.println(test.getClass().getClassLoader());//sun.misc.Launcher$AppClassLoader@18b4aac2 系统类加载器


    }
}
