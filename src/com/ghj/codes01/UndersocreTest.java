package com.ghj.codes01;

public class UndersocreTest {
    public static void main(String[] args) {
        //定义一个32位而禁止数，最高位是符号位
        int bigVal = 0B000_0000_0000_0000_0000_0000_0000_0011;
        System.out.println(bigVal);

        String s = true + "";
        System.out.println(s);
    }
}