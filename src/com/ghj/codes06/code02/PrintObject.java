package com.ghj.codes06.code02;
class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
}
public class PrintObject {
    public static void main(String[] args) {
        Person p = new Person("孙悟空");
        System.out.println(p);
        System.out.println(p.toString() );
    }
}
