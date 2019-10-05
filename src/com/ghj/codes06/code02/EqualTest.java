package com.ghj.codes06.code02;

/**
 * new String("hello"); 创建了两个对象
 * JVN先用常量池来管理hello直接量，然后在调用String的构造器来创建一个新的String对象
 * 常量池：专门用于管理在编译时被确定保存在已经编译的.class文件中的一些数据，他包括了类、
 * 方法、接口中的常量、还包括字符串常量
 */
public class EqualTest {
    public static void main(String[] args) {
        int i = 65;
        float f = 65.0f;
        System.out.println("65和65.0是否相等？"+ (i==f));
        char c = 'A';
        System.out.println("判断'65'和'A'时是否相等？" + (i == c));
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));
    }
}
