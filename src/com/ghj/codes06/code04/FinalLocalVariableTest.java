package com.ghj.codes06.code04;

/**
 * 系统不会对局部变量初始化，局部变量必须由程序员显示初始化。
 * 因此使用final修饰局部变量时，既可以在定义时指定默认值，也可以不指定
 */
public class FinalLocalVariableTest {
    public void test(final int a){
        //不能对final修饰的形参赋值，下面语句非法
        // a = 5;
    }

    public static void main(String[] args) {
        //定义final局部变量时指定默认值，则str变量无法重新赋值
        final String str = "hello";
        //下面赋值语句非法
        //str = "java";
        //定义final局部变量时没有指定默认值，则变量b可被复制一次
        final double d;
        //第一次赋值成功
        d = 3.45;
        //第二次，对final语句重新赋值，下面语句非法
        //d = 3.54;
    }
}
