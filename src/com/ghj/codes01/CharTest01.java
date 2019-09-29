package com.ghj.codes01;

public class CharTest01 {
    public static void main(String[] args) {
        //直接指定单个字符作为字符串
        char a = 'a';
        //使用转移字符来作为字符值
        char a1 = '\r';
        //使用Unicode编码值来指定字符值
        char ch = '\u9999';
        //将输出一个香
        System.out.println(ch);
        //直接定义一个中文字符
        char zhong = '疯';
        System.out.println(zhong);

        //将一个char的变量当成int类型变量使用
        int zhongValue = zhong;
        System.out.println(zhongValue);

        //直接把一个0-65535的int整数赋给char变量
        char c = 97;
        System.out.println(c);
    }
}
