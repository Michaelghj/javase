package com.ghj.codes04;

public class OverloadVarargs {
    public void test(){
        System.out.println("这是一个无参的test方法");
    }
    public void test(String msg){
        System.out.println("这是一个的"+msg+"方法");
    }
    public void test(String... msg){
        System.out.println("这是一个形参可变的方法");
    }

    public static void main(String[] args) {
        OverloadVarargs overloadVarargs = new OverloadVarargs();
        overloadVarargs.test("a", "a", "aaa");
        overloadVarargs.test("shabi");
        overloadVarargs.test();
    }
}
