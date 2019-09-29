package com.ghj.codes03;

public class ArrayInRam {
    public static void main(String[] args) {
        //定义并初始化数组
        int[] a = new int[]{5, 7, 20};
        //定义并初始化数组，使用动态初始化
        int[] b = new int[4];
        //输出b数组的长度
        System.out.println("b数组的长度" + b.length);
        //循环输出a的数组的元素
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        //循环输出b数组的元素
        for (int i = 0; i <b.length; i++){
            System.out.println(b[i]);
        }
        //将a的值赋给b
        /**
         *并不是把a数组的值赋给了b数组；因为a和b都是引用，而初始化的数组都存储在堆中
         * b = a;代表的仅仅是把a的地址给b,既让b的引用指向a而初始化的数组此时没有引用引用了 会变成垃圾
         * 它的长度是没有变化的
         *
         * */
        b = a;
        System.out.println(b.length);
    }
}
