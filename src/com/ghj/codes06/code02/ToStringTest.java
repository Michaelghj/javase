package com.ghj.codes06.code02;
class Apple{
    private String color;
    private double weight;

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    /**
     * 重写toString()方法，用于实现对Apple对象的自我描述
     * @return
     */
    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
public class ToStringTest {
    public static void main(String[] args) {
        Apple apple = new Apple("红色", 5.68);
        System.out.println(apple);
    }
}
