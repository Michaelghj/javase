package com.ghj.codes04;

/**
 * 值传递的特点要知道：
 * 传入方法的是实际参数值的复制品，不管方法中对这个复制品如何操作
 * 实际参数值本身不会受影响
 *
 * swap方法中的a  b只是main中的副本
 */
public class PrimitiveTransferTest {
    public  void swap(int a, int b) {
        int temp = a;
        a = b;
        b =temp;
        System.out.println(b);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        PrimitiveTransferTest primitiveTransferTest = new PrimitiveTransferTest();
        primitiveTransferTest.swap(a, b);
        System.out.println(b);
    }
}
