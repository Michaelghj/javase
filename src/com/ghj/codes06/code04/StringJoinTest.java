package com.ghj.codes06.code04;

public class StringJoinTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello" + "world";
        String s4 = s1 + s2;
        final String s5 = "hello";
        final String s6 = "world";
        String s7 = s5 + s6;
        System.out.println(s3 == s4);
        System.out.println(s3 == s7);
    }
}
