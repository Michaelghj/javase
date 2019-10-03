package com.ghj.codes04;

/**
 * 递归
 */
public class Recursive {
    public int fn(int n){
        if (n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else {
            return 2 * fn(n - 1) + fn(n - 2);
        }
    }
    //如果fn有static可以直接调用fn方法
    public static void main(String[] args) {
        Recursive r = new Recursive();
        System.out.println(r.fn(10));
    }
}
