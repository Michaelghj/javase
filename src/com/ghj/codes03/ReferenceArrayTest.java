package com.ghj.codes03;

/**
 * 当数组的元素是引用类型呢？
 * 1. 在栈内存中保存数组的变量
 * 2. 动态初始化数组，在堆中开辟一块数组的内存
 * 3. main栈区   栈内存
 * 4. 要知道这个内存时如何分布的
 */
class Person{
    public int age;
    public double height;
    public void info(){
        System.out.println("我的年龄是："+ age +",我的身高是： " + height);
    }
}
public class ReferenceArrayTest {
    public static void main(String[] args) {
        //定义一个students变量的数组，类型是person
        Person[] students;
        //执行动态初始化
        students = new Person[2];
        //创建一个Person的实例，并将这个Person实例赋值给zhang变量
        Person zhang = new Person();
        //为zhang所引用的Person对象的age,height赋值
        zhang.age = 20;
        zhang.height = 158;
        //创建一个Person实例，并将这个Person实例赋给lee变量
        Person lee = new Person();
        //为lee所引用的Person对象赋值，
        lee.age = 21;
        lee.height = 159;
        //将zhang赋值给第一个数组元素
        students[0] = zhang;
        //将lee变量赋值给第二数组变量
        students[1] = lee;
        //下面两行的结果完全一样，因为lee和students[1]指向的是同一个实例
        lee.info();
        students[1].info();
    }
}
