package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader1.readLine());
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader2.readLine());

        if(a > b) System.out.println(b);
        if(a < b) System.out.println(a);
        if(a == b) System.out.println(a);
    }
}