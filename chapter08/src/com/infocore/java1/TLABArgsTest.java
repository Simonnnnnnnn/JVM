package com.infocore.java1;

/**
 * 测试-XX:UseTLAB 参数是否开启情况 默认情况是开启的
 *
 * @author XiangZhang
 * @date 2020/6/16 - 15:37
 */
public class TLABArgsTest {

    public static void main(String[] args) {
        System.out.println("我只是来打个酱油~");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
