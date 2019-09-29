package com.ghj.codes04;

public class StaticAccessNostatic {
    public void info(){
        System.out.println("调用info方法");
    }

    public static void main(String[] args) {
        /**
         * 因为main()方法是静态方法，而info是非静态的方法
         * 调用main方法的是该类的本身，而不是该类的实例
         * 因此省略的this无法指向有效的对象
         */
        StaticAccessNostatic staticAccessNostatic = new StaticAccessNostatic();
        staticAccessNostatic.info();
    }
}
