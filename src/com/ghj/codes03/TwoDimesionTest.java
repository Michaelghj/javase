package com.ghj.codes03;

/**
 * 1. int[][] arr; 在栈中定义一个引用 变量
 * 2. arr =  new int[4][]; arr指向一块数组长度为4的数组内存
 *
 */
public class TwoDimesionTest {
    public static void main(String[] args) {
        //定义一个二维数组
        int[][] arr;
        //把arr当成一维数组初始化，初始化arr是一个初始长度为4的数组
        //a数组的数组元素又是引用类型
        arr = new int[4][];
        //把arr数组当成一维数组，遍历arr数组的每个数组元素
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        //初始化arr数组的第一个元素
        arr[0] = new int[2];
        //访问数组arr的第一个元素所指数组的第二个元素
        arr[0][1] = 6;
        for (int i = 0; i < arr[0].length; i++){
            System.out.println(arr[0][i]);
        }

    }
}
