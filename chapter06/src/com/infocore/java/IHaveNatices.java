package com.infocore.java;


/**
 * @author XiangZhang
 * @date 2020/6/15 - 10:06
 */
public class IHaveNatices {

    public native void Native1(int x);

    native static public long Native2();

    native synchronized private float Native3(Object o);

    native void Native4(int[] arr) throws Exception;

}
