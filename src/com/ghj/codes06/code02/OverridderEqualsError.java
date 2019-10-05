package com.ghj.codes06.code02;
class Person01{
    public boolean equals(Object obj){
        //不加判断直接返回true
        return true;
        }
}
class Dog{}
public class OverridderEqualsError {
    public static void main(String[] args) {
        Person01 p = new Person01();
        System.out.println("Person对象是否是Dog对象：" + p.equals(new Dog()));
        System.out.println("Person对象是是否Equals string 对象" + p.equals(new String("hello")));
    }
}
