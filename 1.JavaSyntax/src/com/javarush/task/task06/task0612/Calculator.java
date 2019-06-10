package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    String s = "string";
    int a = 12;
    public static int plus(int a, int b) {
        //напишите тут ваш код

        return a+b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a-b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a*b;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        return (double)a/b;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код

        return a*b*0.01;
    }

    public static void main(String[] args) {
        System.out.println(percent(23,45));
        System.out.println(division(8,2));


    }
}