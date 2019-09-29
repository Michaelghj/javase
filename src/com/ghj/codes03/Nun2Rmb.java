package com.ghj.codes03;


import java.util.Arrays;

public class Nun2Rmb {
    private String[] hArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
    private String[] unitArr = {"十", "百", "千"};

    /**
     * 把一个浮点数分成整数部分和小数部分字符串
     * @param num 需要被分解的浮点数
     * @return 分解出来的整数部分和小数部分，第一个数组元素是整数元素，第二个元素是小数部分
     */
    private String[] divide(double num){
        //将一个浮点数转化成long型就得到他的整数部分
        long zheng = (long) num;
        //浮点数减去整数部分，小数部分乘100后取整得到2位小数
        long xiao = Math.round((num - zheng) * 100);
        //下面的这两种方法都能得到字符串
        return new String[]{zheng + "", String.valueOf(xiao)};
    }

    /**
     * 把一个四位的数字字符串变成汉子字符串
     * @param numStr 需要被转换的四位数字字符串
     * @return 四位数字字符串被转换成数字字符串
     */
    private String toHanStr(String numStr){
        String result  = "";
        int numLen = numStr.length();
        //依次遍历数字字符串中的每一个数字
        for (int i = 0; i < numStr.length(); i++){
            //把char类型转换成int型的数字，他们的ASCII码值刚好像差18
            //因此把char的数字减去48得到int类型的数字，例如'4' -> 4
            int num = numStr.charAt(i) - 48;
            //如果不是最后一为而且数字不为0
            if (i != numLen - 1&& num != 0){
                result += hArr[num] + unitArr[numLen -2 -i];
            }else {
                //不需要加单位
                result += hArr[num];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Nun2Rmb nr = new Nun2Rmb();
        System.out.println(Arrays.toString(nr.divide(13456789.2646)));
        System.out.println(nr.toHanStr("6019"));
    }
}
