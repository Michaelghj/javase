package com.ghj.codes04.code6;
class Creature{
    public Creature(){
        System.out.println("无参的构造方法");
    }
}
class Animal extends Creature{
    public Animal(String name){
        System.out.println("Anmial带一个参数的构造方法" + ",这个动物的名字为" + name);
    }
    public Animal(String name, int age){
        this(name);
        System.out.println("Animal带两个参数的构造器" + ",年龄为" + age);
    }
}
public class Wolf extends Animal{

    public Wolf() {
        super("灰太狼", 3);
        System.out.println("Wolf无参的构造器");
    }

    public static void main(String[] args) {
        new Wolf();
    }
}
