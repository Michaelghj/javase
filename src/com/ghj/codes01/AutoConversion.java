package com.ghj.codes01;

public class AutoConversion {
    public static void main(String[] args) {
        int a = 6;
        //int类型可以自动转换为float类型
        float f = a;
        //下面将输出f = 6.0;
        System.out.println(f);
        //定义一个byte类型的整数变量
        byte b = 9;
        //下面我将尝试把byte类型转换成一个char类型 结果肯定会报错
        //char c1 = b;//报错了
        char c = 9;
        System.out.println("-------------");
        System.out.println(c+1);

        double d = b;
        System.out.println(d);
    }
}
