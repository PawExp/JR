package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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


        if (a <= b && b <= c) {
            System.out.println(c + " " + b + " " + a);
        } else if (b <= a && a <= c) {
            System.out.println(c + " " + a + " " + b);
        } else if (c <= a && a <= b) {
            System.out.println(b + " " + a + " " + c);
        } else if (b <= c && c <= a) {
            System.out.println(a + " " + c + " " + b);
        } else if (a <= c && c <= b) {
            System.out.println(b + " " + c + " " + a);
        } else if (c <= b && b <= a) {
            System.out.println(a + " " + b + " " + c);
        }


    }
}
