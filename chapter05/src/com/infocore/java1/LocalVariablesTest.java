package com.infocore.java1;

import java.util.Date;

/**
 * @author XiangZhang
 * @date 2020/6/11 - 15:25
 */
public class LocalVariablesTest {

    private int count = 0;

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();
    }


    public static void testStatic(){
        LocalVariablesTest test = new LocalVariablesTest();
        Date date = new Date();
        int count = 10;
        System.out.println(count);
        //因为this变量不存在于当前方法的局部变量表中，所以出错
//        System.out.println(this.count);
    }

    //关于slot的理解
    public LocalVariablesTest() {
        this.count = 1;
    }


    public void test1() {
        Date date = new Date();
        String name1 = "atguigu.com";
//        String info = test2(date,name1);
        test2(date,name1);
        System.out.println(date + name1);
    }

    public String test2(Date date, String name1) {
        date = null;
        name1 = "songhongkang";
        double weight = 130.5;//占据两个slot
        char gender = '男';
        return date + name1;
    }

    public void test3(){
        count++;
        //相当于this.count++; jvm将this也作为一个变量放进局部变量表中
    }


    //slot的重复利用
    public void test4(){
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        //变量c使用之前已经销毁的变量b占据的slot的位置
        int c = a + 1;
    }


    /*
    变量的分类：按照数据类型分：① 基本数据类型 ② 引用数据类型
                按照在类中声明的位置分：① 成员变量： 在使用前，都经历过默认初始化赋值
                                        类变量： linking的prepare阶段：给类变量默认赋值  ----> initial阶段 给类变量显式赋值即静态代码块赋值
                                        实例变量：随着对象的创建，会在堆空间中分配实例变量空间，并进行默认赋值
                                     ② 局部变量：在使用前，必须要进行显式赋值的！否则，编译不通过

     */


    public void test5Temp(){
        int num;
//        System.out.println(num);//报错 Variable 'num' might not have been initialized  变量num未进行初始化
    }

}
