package com.ghj.codes04;

/**
 * 对static修饰的方法而言，则可以使用类来直接调用方法
 * 如果在static修饰的方法中使用this关键字，则这个关键字就无法
 * 指向合适的对象，所以static修饰的方法中不能使用this引用，由于static修饰的方法不能使用this引用
 * 所以static修饰的方法不能访问不使用static修饰的普通成员，
 * 所以：静态成员不能访问非静态成员
 */
public class DogTest {
    public static void main(String[] args) {
        //创建Dog对象
        Dog dog = new Dog();
        dog.run();
    }
}
