package com.ghj.codes01;

public class NarrowConversion {
    public static void main(String[] args) {
        int iValue = 233;
        //强制把一个int类型转化为byte类型
        byte b = (byte) iValue;
        /**
         * 1. 最左边的一位是符号位
         * 2. 负数在计算机里是以补码形式存在的，因此转换成原码
         * 3. 11101001 -> 补码减一为反码 11101000 ->原码 10010111
         */
        //将输出-23
        System.out.println(b);
        double d = 3.968;
        //强制把double转化为int类型
        int i = (int) d;
        //将输出3
        System.out.println(i);
    }
}
