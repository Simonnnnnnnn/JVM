package com.infocore.java1;

/**
 * @author XiangZhang
 * @date 2020/6/11 - 20:44
 */
public class DynamicLinkingTest {

    int num = 10;

    public void methodA(){
        System.out.println("methodA()....");
    }

    public void methodB(){
        System.out.println("methodB()....");

        methodA();

        num++;
    }


}
