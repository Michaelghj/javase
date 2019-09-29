package com.ghj.codes04;

public class Dog {
    //定义一个jump()方法
    public void jump(){
        System.out.println("正在执行jump方法");
    }

    //定义一个run()方法
    public void run(){
        //没有static修饰的成员变量和方法都必须用对象来调用
        Dog dog = new Dog();
        dog.jump();
        System.out.println("正在执行run方法");
    }

    //定义一个run1()方法，用run1()需要借助jump()方法
    public void run1(){
        //使用this引用调用run方法的对象
        this.jump();
        System.out.println("正在执行run1方法");
    }
}
