package com.infocore.java1;

import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试Minor GC Major GC Full GC
 *
 * -Xms9m -Xmx9m -XX:+PrintGCDetails
 *
 * [PSYoungGen: 1978K->480K(2560K)] 1978K->842K(9728K), 0.0023990 secs
 *  1978K 新生代垃圾回收之前的空间大小
 *  480K  进行完垃圾回收之后，新生代的空间大小
 *  2560K 新生代总空间大小
 *
 *  1978K堆空间垃圾回收之前的空间大小
 *  842K 进行完垃圾回收之后，堆空间的大小
 *  9728K 堆总空间大小
 *  0.0023990 secs 垃圾回收耗时
 * @author XiangZhang
 * @date 2020/6/16 - 14:24
 */
public class GCTest {

    public static void main(String[] args) {
        int i = 0;

        try {
            List<String> list = new ArrayList<>();
            String a = "atguigu.com";
            while (true){
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("遍历次数为：" + i);
        }
    }
}
