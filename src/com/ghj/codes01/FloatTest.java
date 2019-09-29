package com.ghj.codes01;
/**
 *  1. java原因默认的浮点数类型是double
 *  2. float f = 5.12f;
 *  3. java还提供了三种特殊的浮点数值：正无穷大 、 负无穷大 、 非数（NaN）
 *  4. 正数除以0是正无穷大 负数除以0是负无穷大 0.0/0.0或者对一个负数开方将得到一个非数
 */
public class FloatTest {
    public static void main(String[] args) {
        float f = 5.2345556f;
        System.out.println(f);
        double a = 0.0;
        double c = Double.NEGATIVE_INFINITY;
        float f1 = Float.NEGATIVE_INFINITY;
        //double和float的无穷大是相等的
        System.out.println(c==f1);
        //非数
        System.out.println(a / a);
        //非数与非数不相等
        System.out.println(Float.NaN == a / a);
        //正无穷大与正无穷大相等
        System.out.println(56.0 / 0 == 566.0 /0);

        System.out.println(-8 / a);
        //java.lang.ArithmeticException: / by zero
        //System.out.println(0 / 0);
    }
}
