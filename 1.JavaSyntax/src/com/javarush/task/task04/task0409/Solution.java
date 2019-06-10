package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        int c = a - 10;//-2
        int d = b - 10;//1
        Solution.abs(c);
        Solution.abs(d);

        if (Solution.abs(c) > Solution.abs(d)){
            System.out.println(b);
        }
        if (Solution.abs(c) <= Solution.abs(d)){
            System.out.println(a);
        }


    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}