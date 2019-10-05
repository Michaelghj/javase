package com.ghj.codes06.code02;

/**
 * equals是object类的一个实例方法，因此所有的引用变量都可以调用这个该方法
 * 来判断是与其他变量相等。但使用这个方法判断两个对象的标准与使用==运算符没有区别
 *
 */
public class StringCompareTest {
    public static void main(String[] args) {
        String s1 = "疯狂java";
        String s2 = "疯狂";
        String s3 = "java";
        String s4 = "疯狂" + "java";
        String s5 = "疯" + "狂" + "java";
        /**
         * s6后面的字符串在值在编译的时候不能确定下来
         * 不能引用常量池中字符串
         */
        String s6 = s2 + s3;
        String s7 = new String("疯狂java");
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s7);
    }
}