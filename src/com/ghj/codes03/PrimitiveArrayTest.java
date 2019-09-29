package com.ghj.codes03;

public class PrimitiveArrayTest {
    /**
     * 1. 定义变量时先把变量放入栈中
     * 2. 在堆中开辟一个长度为5的数组
     * 3. 为堆中的数组赋值
     * @param args
     */
    public static void main(String[] args) {
        //定义一个int[]类型的数组变量
        int[] iArr;
        //动态的初始化数组，数组长度为5
        iArr = new int[5];
        //采用循环的方式为数组复制
        for (int i = 0; i < iArr.length; i++){
            iArr[i] = i + 10 ;
        }
        for (int iArrs : iArr){
            System.out.println(iArrs);
        }
    }
}
