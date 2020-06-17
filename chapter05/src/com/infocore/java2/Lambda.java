package com.infocore.java2;

/**
 * 体会invokedynamic指令
 *
 *
 *
 * @author XiangZhang
 * @date 2020/6/12 - 14:22
 */
@FunctionalInterface
interface Func{
    public boolean func(String str);
}


public class Lambda {

    public void lambda(Func func){
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        Func func = s -> {
            return true;
        };
        System.out.println(func);
        lambda.lambda(func);

        lambda.lambda(s -> {
            return true;
        });





    }


}
