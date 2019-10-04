package com.ghj.codes04.code7;
class BaseClass{
    public int book = 6;
    public void base(){
        System.out.println("父类的普通方法");
    }
    public void test(){
        System.out.println("父类被覆盖的方法");
    }
}
public class Subclass extends BaseClass{
    //重新定义一个book实例变量隐藏父类的book实例变量
    public String book = "轻量级Java EE企业级应用";
    public void test(){
        System.out.println("子类覆盖父类的方法");
    }
    public void sub() {
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();
        System.out.println(baseClass.book);
        baseClass.base();
        baseClass.test();
        Subclass subclass = new Subclass();
        System.out.println(subclass.book);
        subclass.sub();
        subclass.test();
        //下面编译时类型和运行时类型不一样，多态发生
        //编译时类型为BaseClass 运行时类型为SubClass
        BaseClass ploymophicbc = new Subclass();
        System.out.println(ploymophicbc.book);
        ploymophicbc.test();
        ploymophicbc.base();
        //ploymophicbc.sub();
    }

}
