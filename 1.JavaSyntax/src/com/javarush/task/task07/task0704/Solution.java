package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] n = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < n.length; i++)
            n[i] = Integer.parseInt(reader.readLine());
        for(int i = 0; i < n.length; i++)
            System.out.println(n[n.length-1-i]);
    }
}

