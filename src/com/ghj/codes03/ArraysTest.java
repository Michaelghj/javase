package com.ghj.codes03;

import java.util.Arrays;

/**
 * java.util.arrays
 * 1. binarySearch(type[] a, type key)
 * 2. binarySearch(type[] a, int fromIndex, int toIndex, type key)
 * 3. type[] copyOf(type[] original, int length);
 * 4. boolean equals(type[] a1, type[] a2);长度和元素都要相同
 * 5. void fill(type[] a, val);把a数组的值赋为val
 * 6. void sort(type[] a);对数组a的元素进行排序
 * 7. String toString(type[] a);将数组转化成一个字符串
 */
public class ArraysTest {
    public static void main(String[] args) {
        //定义一个arr数组
        int[] arr = new int[]{3, 4, 5, 6};
        //定义一个arr2数组
        int[] arr2 = new int[]{3, 4, 5, 6};
        //输出true,因为arr和arr2的长度和元素都相同
        System.out.println("arr数组和arr2数组是否相等："+Arrays.equals(arr, arr2));

        int[] b = Arrays.copyOf(arr, 6);
        System.out.println(Arrays.equals(arr, b));
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        for (int b1 : b){
            System.out.print(b1);
        }
    }
}
