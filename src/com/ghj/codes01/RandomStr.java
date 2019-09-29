package com.ghj.codes01;


/**
 * 随机生成字符串
 */
public class RandomStr {
    public static void main(String[] args) {
        //定义一个空的字符串
        String result = "";
        //进行6次循环
        for (int i = 0; i < 6; i++){
            //生成一个97 - 122之间的int类型整数
            int iValue = (int) (Math.random() * 26 + 97);

            //将intValue强制转化为char类型后连接到result后面
            result = result + (char)iValue;
        }
        System.out.println(result);

        float a = (float) 4.5;
        String string = "40";
        int iValue = Integer.parseInt(string);
        System.out.println(iValue );

    }



}
