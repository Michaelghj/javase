package com.ghj.codes15.code02;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        FileInputStream fis = new FileInputStream("FileInputStreamTest.java");
        //创建一个长度为1024的竹筒
        byte[] bytes = new byte[1024];
        //用于保存实际读取的字节数
        int hasReader = 0;
        //使用循环来重复“取水”的过程
        while ((hasReader = fis.read(bytes)) > 0){
            //取出竹筒中的水滴，将字节数组装换成字符串输入
            System.out.print(new String(bytes, 0, hasReader));
        }
        fis.close();
    }
}
