package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        int x = (int) (t / 5) * 5;
        double y = t - x;


        if (y < 3) {
            System.out.println("зелёный");

        } else if (y >= 3 & y < 4) {
            System.out.println("жёлтый");
        } else if (y >= 4 & y < 5) {
            System.out.println("красный");
        }

    }
}