package com.infocore.java1;

/**
 *
 * -Xms600m -Xmx600m
 *
 * -XX:NewRatio: 设置新生代与老年代的比例，默认值是2
 * -XX:SurvivorRatio=8：设置新生代中Eden区与Survivor区的比例，默认值是8，但是测试的时候，值是6，因为jvm存在一个自适应的机制UseAdaptiveSizePolicy
 *                      要想是8，需要显式的加上这个参数
 * -XX:-UseAdaptiveSizePolicy: 关闭自适应的内存分配策略 （暂时用不到）
 * -Xmn:设置新生代的空间的大小 （一般不设置）。 如果同时设置-XX:NewRatio和-Xmn 会根据-Xmn来设置
 *
 * @author XiangZhang
 * @date 2020/6/15 - 20:56
 */
public class EdenSurvivorTest {


    public static void main(String[] args) {
        System.out.println("我只是来打个酱油~");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
