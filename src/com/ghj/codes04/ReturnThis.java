package com.ghj.codes04;

/**
 * 当this作为对象的默认引用使用时，程序可以像访问普通引用变量一样来访问这个this引用，
 * 甚至可以吧=把this当成普通方法的返回值
 */
public class ReturnThis {
    public int age;
    public ReturnThis grow(){
        age++;
        //return this返回调用该方法的对象
        return this;
    }

    public static void main(String[] args) {
        ReturnThis returnThis = new ReturnThis();
        //可以连续调用一个方法
        returnThis.grow().grow();
        System.out.println("return的age值成员变量是："+returnThis.age);
    }
}
