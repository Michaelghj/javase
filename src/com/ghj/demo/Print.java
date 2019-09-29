package com.ghj.demo;

import java.util.ArrayList;
import java.util.List;

public class Print {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(0);
        List list1 = list;
        System.out.println(list.get(0) instanceof Integer);
        System.out.println(list1.get(0) instanceof Integer);
    }
}
