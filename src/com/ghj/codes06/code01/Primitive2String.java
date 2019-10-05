package com.ghj.codes06.code01;

/**
 * 包装类实现基本类型变量和字符串之间的转换，把字符串转成基本数据类型有两种方式
 * 1. 利用包装类提供的parseXxx(String str);
 * 2. 利用包装类提供的valueOf(String str);
 */
public class Primitive2String {
    public static void main(String[] args) {
        String intStr = "123";
        //把一个字符串装换成int类型的基本数据
        int i1 = Integer.parseInt(intStr);
        int i2 = Integer.valueOf(intStr);

        System.out.println(i1);
        System.out.println(i2);

        String floatStr = "120.35";
        //把一个字符串装换成float类型的基本数据
        float f1 = Float.parseFloat(floatStr);
        float f2 = Float.valueOf(floatStr);
        System.out.println(f1);
        System.out.println(f2);

        //把一个float变量转换成string类型
        String ftStr = String.valueOf(f1);
        System.out.println(ftStr);

        //把一个double变量装换成string变量
        String dStr = String.valueOf(3.44);
        System.out.println(dStr);

        //把一个Boolean变量装换成字符串
        String boolStr = String.valueOf(true);
        System.out.println(boolStr.toUpperCase());

    }
}
