package com.ghj.codes01;

public class PrimitiveAndString {
    public static void main(String[] args) {
        // String s = 5; //报错5是一个整数，不能直接赋给字符串
        //一个基本类型的值和字符串行连接运算时，基本类型的值自动转换为字符串
        String str2 = 3.5f + "";
        String str1 = 3.5 + "";
        //将输出3.5
        System.out.println(str1);
        System.out.println(str2);
        //输出true
        System.out.println(str1 == str2);
        //第一个和第二个区别就是第一个3+4是数字运算 第二个是+3+4字符串的拼接
        System.out.println(3 + 4 + "hello!");
        System.out.println("hello!"+ 3 + 4);
    }
}
