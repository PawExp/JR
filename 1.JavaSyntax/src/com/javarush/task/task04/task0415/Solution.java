package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader1.readLine());
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader2.readLine());
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(reader3.readLine());




        if ((a + b) > c & (a + b) != c & (a + c) > b & (a + c) != b & (b + c) > a & (b + c) != a) {
            System.out.println("Треугольник существует.");

        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}