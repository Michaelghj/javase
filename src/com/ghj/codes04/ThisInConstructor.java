package com.ghj.codes04;

public class ThisInConstructor {
    //定义一个foo的变量
    public int foo;

    /**
     * 在ThisInConstructor构造器中使用this引用时，this总是引用该构造器正在初始化的对象，
     * 与普通方法累死的是，大部分时候，在构造器中访问其他成员变量和方法是都可以省略this前缀，
     * 但如果构造器中有一个与成员边来那个同名的局部变量，又必须在构造器中访问这个被覆盖的成员
     * 变量，则必须使用this前缀，
     */
    public ThisInConstructor(){
        //在构造器中定义一个foo变量
        int foo = 0;
        //使用this代表该构造器正在初始化的对象
        //下面的代码将会把正在初始化的对象的foo成员变量设置为6
        this.foo = 6;
    }

    public static void main(String[] args) {
        //所有使用ThisInConstructor创建的对象的foo成员变量设为6
        System.out.println(new ThisInConstructor().foo);
    }
}
