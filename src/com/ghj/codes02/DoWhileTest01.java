package com.ghj.codes02;

public class DoWhileTest01 {
    public static void main(String[] args) {
        //把for循环的初始化条件提出来独立定义
        int count = 0;
        //for里面脂肪循环条件
        for ( ; count < 10 ;){
            System.out.println(count);
            //把循环迭代部分放在循环体之后定义
            count++;
        }
        System.out.println("循环结束");

    }
}
