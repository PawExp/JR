package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int x = 1;

        while (x <= 10) {
            int a = 1;
            while (a <= 10) {
                System.out.print(x * a + " ");
                a++;
            }
            System.out.println();
            x++;
        }
    }
}

