package com.ghj.codes04.code5;

public class Constructor {

    public String name;
    public int count;
    public Constructor(String name, int count){
        //构造器里的this将代表他进行初始化的对象
        //下面两行将传入的参数赋给this对象的name和count变量
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        //使用自定义的构造器来创建对象
        //系统将会对该对象执行自定义的初始化
        Constructor constructor = new Constructor("Java疯狂讲义", 2);
        //输出constructor对象的实例变量
        System.out.println(constructor.count);
        System.out.println(constructor.name);
    }
}
