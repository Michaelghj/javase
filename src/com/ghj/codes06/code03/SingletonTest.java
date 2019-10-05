package com.ghj.codes06.code03;
class Singleton{
    //创建一个类变量来缓存曾经创建的实例
    private static Singleton insatance;
    //用private修饰该构造器，隐藏该构造器
    private Singleton(){}
    //提供一个静态的方法用于返回Singleton实例
    //该方法可以加入自定义控制，保证只产生一个Singleton对象
    public static Singleton getInstance(){
        if (insatance == null){
            insatance = new Singleton();
        }
        return insatance;
    }
}
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
