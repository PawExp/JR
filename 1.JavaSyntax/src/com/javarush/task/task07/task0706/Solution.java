package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] n = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < n.length; i++)
            n[i] = Integer.parseInt(reader.readLine());
        int x1 = 0;
        int x2 = 0;
        for(int i = 0; i < n.length; i = i + 2)
            x2 = x2 + n[i];
        for(int i = 1; i < n.length; i = i +2)
            x1 = x1 + n[i];
        String s = x1 > x2 ? "В домах с нечетными номерами проживает больше жителей." : "В домах с четными номерами проживает больше жителей.";
        System.out.println(s);
    }
}
