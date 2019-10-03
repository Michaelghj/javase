package com.ghj.codes04;

/**
 * 1. 成员变量无需初始化，只要为一个类定义了类变量或者实例变量
 * 系统就会在这个类准备阶段或者创建该类的实例是默认初始化，
 *
 *
 */
class Person{
    public String name;
    public static int eyeNum;
}
public class PersonTest {
    public static void main(String[] args) {
        //第一次使用Person类，该类自动初始化，则eyeNum变量起作用为0
        System.out.println("Person类的eyeNum类变量值"+ Person.eyeNum);
        //创建一个Person对象
        // eyeNum并不属于Person对象，它是属于Person类的
        Person p = new Person();
        //通过Person对象的引用来访问Person对象name实例变量
        //并通过实例访问eyeNum
        System.out.println("p变量的name变量值是" + p.name + "p变量的eyeNum值是"+ p.eyeNum);
        p.name = "杨狗币";
        p.eyeNum = 2;
        System.out.println(p.name);
        System.out.println(p.eyeNum);
        Person p2 = new Person();
        //输出null
        System.out.println(p2.name);
        System.out.println(p2.eyeNum);
    }

}
