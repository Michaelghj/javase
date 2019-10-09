package com.ghj.codes15.code02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        try

        {
            try (FileReader fr = new FileReader("FileReaderTest.java")) {
                //c创建一个长度为32的竹筒
                char[] chars = new char[24];
                //用于保存实际读取的字符数
                int hasread = 0;
                while ((hasread = fr.read(chars) )> 0) {
                    //取出竹筒中的水滴，将字符数组装换成字符串输入
                    System.out.println(new String(chars, 0, hasread));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
