package com.ghj.codes04.code5;

public class ConstructorOverload {
    public String name;
    public int count;
    //无参的构造方法
    public ConstructorOverload(){}
    public ConstructorOverload(String name, int count){
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        ConstructorOverload constructorOverload1 = new ConstructorOverload();
        ConstructorOverload constructorOverload2 = new ConstructorOverload("轻量级java ee实战" , 3);
        System.out.println(constructorOverload1.name + " " + constructorOverload1.count);
        System.out.println(constructorOverload2.name + " " + constructorOverload2.count);
    }
}
