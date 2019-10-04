package com.ghj.codes04.code8;

public class InstanceInitTest {
    //先执行初始化块将a实例赋值为6
    {
        a = 6;
    }
    //在执行将a实例变量赋值为9
    int a = 9;

    public static void main(String[] args) {
        System.out.println(new InstanceInitTest().a);
    }
}
