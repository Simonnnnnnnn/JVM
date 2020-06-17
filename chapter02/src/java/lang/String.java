package java.lang;

/**
 * @author XiangZhang
 * @date 2020/6/10 - 15:50
 */
public class String {

    static {
        System.out.println("我是自定义的String类的静态代码块");
    }


    public static void main(String[] args) {
        System.out.println("hello,String");//错误: 在类 java.lang.String 中找不到 main 方法
        //如果我们想去执行main方法，那main方法所在的类就要被加载，根据双亲委派机制，会加载java核心类库中的String类
        //但是java核心类库中的String是没有main方法的，所以报错
    }


}
