package com.infocore.java;

/**
 * 演示栈中的异常：Exception in thread "main" java.lang.StackOverflowError
 * @author XiangZhang
 * @date 2020/6/11 - 13:33
 *
 *
 *  默认情况下 count : 11410
 *
 *  设置栈的大小 -Xss256k后 count :  2478
 *
 *
 */
public class StackOverErrorTest {

    private static int count = 1;


    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
