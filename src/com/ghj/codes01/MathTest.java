package com.ghj.codes01;

public class MathTest {
    public static void main(String[] args) {
        //给变量b赋值
        double d = 3.2;
        //求d的5次方
        double a = Math.pow(d ,5);
        System.out.println(a);

        //求a的平方根
        double c = Math.sqrt(a);
        System.out.println(c);
        //输出一个随机数
        double b = Math.random();
        System.out.println(b);
    }
}
