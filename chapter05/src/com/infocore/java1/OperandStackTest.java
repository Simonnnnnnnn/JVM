package com.infocore.java1;

/**
 * @author XiangZhang
 * @date 2020/6/11 - 19:14
 */
public class OperandStackTest {

    public void testAddOperation(){
        //byte、short、char、boolean：都以int型来保存
        byte i = 15;
        int j = 8;
        int k = i + j;


//        int m = 8;//bipush,因为8在byte范围内，一个字节就能存，istore的时候将byte转成了int
//        int m = 800;//sipush,因为800超出了byte的范围，就被认为是一个short，以此类推。
    }


    public int getSum(){
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }

    public void testGetSum(){
        //获取上一个栈帧返回的结果，并保存在操作数栈中
        int i = getSum();
        int j = 10;
    }



    /*
    常见的i++和++i的区别，从字节码的角度来分析
     */

    public void add(){
        //第1类问题
        int i1 = 10;
        i1++;
//        System.out.println("i1 = " + i1);


        int i2 = 10;
        ++i2;
//        System.out.println("i2 = " + i2);

        //第2类问题
        int i3 = 10;
        int i4 = i3++;//10
//        System.out.println("i3 = " + i3);
//        System.out.println("i4 = " + i4);

        int i5 = 10;
        int i6 = ++i5;//11
//        System.out.println("i5 = " + i5);
//        System.out.println("i6 = " + i6);

        //第3类问题
        int i7 = 10;
        i7 = i7++;//
//        System.out.println("i7 = " + i7);

        int i8 = 10;
        i8 = ++i8;
//        System.out.println("i8 = " + i8);

        //第4类问题
        int i9 = 10;
        int i10 = i9++ + ++i9;//22
//        System.out.println("i9 = " + i9);
//        System.out.println("i10 = " + i10);

    }


//    public static void main(String[] args) {
//        OperandStackTest test = new OperandStackTest();
//        test.add();
//    }


}
