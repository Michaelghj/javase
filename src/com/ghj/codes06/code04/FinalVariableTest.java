package com.ghj.codes06.code04;

public class FinalVariableTest {
    final int a = 6;
    final String str;
    final int c;
    final static double d;

    {
        str = "hello";
        //a = 9;
    }
    static {
        d = 5.6;
    }

    public FinalVariableTest(){
        c = 5;
    }

    public void changeFinal(){

    }

    public static void main(String[] args) {
        FinalVariableTest finalVariableTest = new FinalVariableTest();
        System.out.println(finalVariableTest.a);
        System.out.println(finalVariableTest.c);
        System.out.println(finalVariableTest.str);
    }
}
