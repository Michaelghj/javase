package com.ghj.codes04;

/**
 * 1. Java程序中确定一个方法需要三个因素
 *  调用者
 *  方法名
 *  形参列表
 * 2. 重载：
 *      同一个类中方法名相同，参数列表不同，其他部分：返回值类型、修饰符与方法的重载没有关系
 * 3. java调用方法可以忽略方法返回值，
 */
public class Overload {
    public void test(){
        System.out.println("无参的");
    }
    public String test(String msg){
        System.out.println("重载的test方法" + msg);
        return msg;
    }

    public static void main(String[] args) {
        Overload ov = new Overload();
        ov.test();
        ov.test("hello");
    }
}

