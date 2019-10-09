package com.ghj.codes15.code02;

import java.io.*;

public class FileOutPutStreamTest {
    public static void main(String[] args) {
        try {
            //创建字节输入流
            FileInputStream fileInputStream = new FileInputStream("FileOutPuntStream.java");
            //创建字节输出流
            FileOutputStream fileOutputStream = new FileOutputStream("newText.txt");
            byte[] bytes = new byte[32];
            int hasreader = 0;
            //循环从输入流中读取数据
            while ((hasreader = fileInputStream.read(bytes)) > 0){
                fileOutputStream.write(bytes,0,hasreader);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
