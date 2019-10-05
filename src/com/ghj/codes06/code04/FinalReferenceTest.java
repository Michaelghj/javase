package com.ghj.codes06.code04;

import java.util.Arrays;

/**
 * final修饰基本数据类型和修饰引用变量的区别
 * 1. 当使用final修饰基本数据类型时，不能对基本数据类型重新赋值，因此基本数据类型变量不能改变
 * 2. 当final修饰引用变量时，它保存的仅仅是一个引用，final只保证这个引用的地址不变，这个对象可以变化
 */
class Person{
    private int age;
    public Person(){}
    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class FinalReferenceTest {
    public static void main(String[] args) {
        final int[] arr = {1,2,5,3,4};
        System.out.println(Arrays.toString(arr));
        //对数组排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        arr[2] = -8;
        System.out.println(Arrays.toString(arr));
        final Person p = new Person(45);
        p.setAge(35);
        System.out.println(p.getAge());
    }
}
