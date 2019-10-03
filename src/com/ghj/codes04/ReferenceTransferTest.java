package com.ghj.codes04;
class DataWrap{
    int a;
    int b;
}
public class ReferenceTransferTest {
    public static void swap(DataWrap dw) {
        int temp = dw.a;
        dw.a = dw.b;
        dw.b = temp;
        System.out.println("a的值为"+ dw.a + "b的值为" + dw.b);
    }

    public static void main(String[] args) {
        DataWrap dataWrap = new DataWrap();
        dataWrap.a = 6;
        dataWrap.b = 9;
        swap(dataWrap);
        dataWrap = null;
        System.out.println("交换结束后a的值" + dataWrap.a + "交换后b的值" + dataWrap.b);
    }
}
