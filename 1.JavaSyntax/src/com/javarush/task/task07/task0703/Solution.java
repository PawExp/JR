package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String [] s = new String[10];
        int [] n = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < s.length; i ++)
            s[i] = reader.readLine();
        for(int i = 0; i < s.length; i++)
            n[i] = s[i].length();
        for(int i = 0; i < n.length; i++)
            System.out.println(n[i]);
    }
}
