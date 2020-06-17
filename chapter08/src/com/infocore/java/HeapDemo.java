package com.infocore.java;

/**
 *
 * -Xms10m -Xmx10m
 * @author XiangZhang
 * @date 2020/6/15 - 11:30
 */
public class HeapDemo {
    public static void main(String[] args) {
        System.out.println("start....");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("end....");
    }

}
