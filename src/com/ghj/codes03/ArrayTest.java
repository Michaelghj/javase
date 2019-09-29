package com.ghj.codes03;

/**
 * java.lang.ArrayIndexOutOfBoundsException
 * 数组下标越界
 * */

public class ArrayTest {
    public static void main(String[] args) {
        int[] intArr;
        intArr = new int[] {1, 5, 6, 8, 10};
        Object[] objArr = new String[]{"Java", "李刚"};
        Object[] objArr2 = new String[]{"Java", "李刚"};
        System.out.println(objArr[1]);

        for(int arrs : intArr){
            System.out.println(arrs);
        }

    }
}
