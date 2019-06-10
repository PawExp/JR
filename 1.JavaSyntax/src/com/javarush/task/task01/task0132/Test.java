package com.javarush.task.task01.task0132;

public class Test {
    public static void main(String[] args) {
        int a = 546;
        int b = a%10;//6
        int c = (int) ((a-b)*0.1)%10;//4
        int d = (int) ((((a-b)*0.1) - c)*0.1);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
