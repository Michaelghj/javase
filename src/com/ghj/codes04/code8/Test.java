package com.ghj.codes04.code8;
class Root{
    static {
        System.out.println("Root的静态初始化代码块");
    }
    {
        System.out.println("Root的初始化代码块");
    }
    public Root(){
        System.out.println("Root类的构造器");
    }
}
class Mid extends Root{
    static {
        System.out.println("Mid类的静态初始化代码块");
    }
    {
        System.out.println("Mid的初始化代码块");
    }
    public Mid(){
        System.out.println("Mid的构造器");
    }
    public Mid(String msg){
        //通过this调用同一个类中的重载构造器
        this();
        System.out.println("Mid的带参数构造器，其参数值" + msg);
    }
}
class Leaf extends Mid{
    static {
        System.out.println("Lea的静态初始化代码块");
    }
    {
        System.out.println("Leal初始化块");
    }
    public Leaf(){
        //通过super调用父类中一个字符串参数的构造器
        super("java疯狂讲义");
        System.out.println("执行Leaf构造器");
    }
}
public class Test {
    public static void main(String[] args) {
        new Leaf();
        new Mid();
    }
}
