package com.ghj.codes06.code01;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        Integer inObj = 5;
        Object boolObj = true;

        int it = inObj;
        if (boolObj instanceof Object){
            //先把object对象强制类型转换为Boolean类型，在赋给boolean变量
            boolean b = (boolean) boolObj;
            System.out.println(b);
        }
    }
}
