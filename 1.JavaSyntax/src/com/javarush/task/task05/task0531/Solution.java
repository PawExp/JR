package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int f = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c,d,f);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int f) {
        int s1 = a <= b ? a : b;
        int s2 = c <= d ? c : d;
        int s3 = s1 <= s2 ? s1 : s2;
        int s4 = s3 <= f ? s3 : f;
        return s4;
    }
}
