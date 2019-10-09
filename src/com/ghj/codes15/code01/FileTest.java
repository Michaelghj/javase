package com.ghj.codes15.code01;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        //以当前的路径来创建一个File对象
        File file = new File(".");
        //直接获取文件名，输出.
        System.out.println(file.getName());
        //获取相对路径的父路径可能出错，下面代码输出null
        System.out.println(file.getParent());
        //获取绝对路径
        System.out.println(file.getAbsoluteFile());
        //获取上一级路径
        System.out.println(file.getAbsoluteFile().getParent());
        //在当期路径下创建一个临时文件
        File tempFile = File.createTempFile("aaa",".text",file);
        //指定当JVM退出时 删除该临时文件
        tempFile.deleteOnExit();

        //以系统当前时间作为新文件名来创建新文件
        File file1 = new File(System.currentTimeMillis() + "");
        System.out.println("file1对象是否存在：" + file1.exists());
        //以指定file1对象来创建一个文件
        file1.createNewFile();
        //以file1对象来创建一个目录，因为file1已经存在
        //所以下面返回false，既无法创建目录
        System.out.println(file1.mkdir());

        //使用list方法列出当前路径下的所有文件路径
        String[] fileList = file.list();
        System.out.println("====当前路径下的所有文件====");
        for (String fileName : fileList){
            System.out.println(fileName);
        }
        //listRoots()静态方法列出所有的磁盘根路径
        File[] roots = File.listRoots();
        System.out.println("====系统的根路径如下====");
        for(File root : roots){
            System.out.println(root);
        }
    }
}
