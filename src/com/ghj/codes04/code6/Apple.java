package com.ghj.codes04.code6;

public class Apple extends Fruit{
    public static void main(String[] args) {
        //创建Apple对象
        Apple apple = new Apple();
        //Apple类本身没有weight成员变量
        //因为Apple的父类有weight成员变量，也可以访问Apple对象的weight成员变量
        apple.weight = 56;
        //调用的是Apple的info方法
        apple.info();
    }
}
