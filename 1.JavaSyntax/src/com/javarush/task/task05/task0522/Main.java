package com.javarush.task.task05.task0522;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(22);
        Circle c2 = new Circle(c1);
        System.out.println(c2.radius);
    }
}
