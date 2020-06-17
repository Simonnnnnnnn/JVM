package java.lang;

/**
 * @author XiangZhang
 * @date 2020/6/10 - 16:18
 */
public class ZxStart {

    public static void main(String[] args) {
        System.out.println("test");//java.lang.SecurityException: Prohibited package name: java.lang
        //因为java.lang包下没有这个类
    }
}
