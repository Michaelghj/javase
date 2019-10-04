package com.ghj.codes04.code8;

public class Person {
    {
        int a = 6;
        if (a > 4){
            System.out.println("Person初始化块：局部变量a的值大于4");
        }
        System.out.println("Person的第一个初始化块");
    }
    //定义第二个初始化块
    {
        System.out.println("Person的第二个初始化块");
    }
    //定义一个构造器
    public Person(){
        System.out.println("Person类的无参构造器");
    }

    public static void main(String[] args) {
        new Person();
    }
}
