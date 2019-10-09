package com.ghj.codes15.code01;

import java.io.File;

public class FilenameFilterTest {
    public static void main(String[] args) {
        File file = new File(".");
        //使用lambda表达式实现文件过滤器
        //如果以文件名.java结尾，或者文件对应一个路径，则返回true
        String[] nameList = file.list((dir, name) -> name.endsWith(".java") || new File(name).isDirectory());
        for (String name : nameList){
            System.out.println(name);
        }
    }
}
