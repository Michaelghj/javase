package com.ghj.demo;

public class getValue {
    /**
     * 注意对比getVal()方法和getVal1()方法的区别以及输出结果
     * @param i
     * @return
     */
    public static int getVal(int i){
        int result = 0;
        switch (i){
            case 1:
                result = result +i;
            case 2:
                result = result + i*2;
            case 3:
                result = result + i*3;
        }
        //10
        System.out.println(result);
        return result;
    }
    public static void getVal1(int i){
        int result = 0;
        switch (i){
            case 1:
                result = result +i;
                break;
            case 2:
                result = result + i*2;
                break;
            case 3:
                result = result + i*3;
                break;
        }
        //4
        System.out.println(result);
    }
    public static void main(String[] args) {
        getVal(2);
        getVal1(2);
        StringBuffer s1 = new StringBuffer(10);
        System.out.println(s1.append("1234"));
        System.out.println(s1.length());
        System.out.println(s1.capacity());
    }
}
