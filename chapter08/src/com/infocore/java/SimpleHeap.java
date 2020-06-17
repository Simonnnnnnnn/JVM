package com.infocore.java;

/**
 * @author XiangZhang
 * @date 2020/6/15 - 17:05
 */
public class SimpleHeap {
    private int id;

    public SimpleHeap(int id) {
        this.id = id;
    }

    public void show(){
        System.out.println("My ID is" + id);
    }

    public static void main(String[] args) {
        SimpleHeap h1 = new SimpleHeap(1);
        SimpleHeap h2 = new SimpleHeap(2);
        //注意，当方法执行完弹栈了，这两个对象不是马上就被GC回收的

//        int[] arr = new int[10];
//
//        Object[] arr1 = new Object[10];
    }




}
