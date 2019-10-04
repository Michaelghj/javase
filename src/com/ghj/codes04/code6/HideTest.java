package com.ghj.codes04.code6;
class Parent{
    public String tag = "java疯狂讲义";
}
class Derived extends Parent{
    //定义一个私有的tag实例变量来隐藏父类的tag变量
    private String tag = "java ee 轻量级企业应用";
}
public class HideTest {
    public static void main(String[] args) {
        Derived d = new Derived();
        //对比下面两条语句
        //System.out.println(d.tag);
        System.out.println(((Parent)d).tag);
    }
}
