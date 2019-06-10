package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
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
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(reader4.readLine());



        if(a >= b && a >= c && a >= d){
            System.out.println(a);
        }
        else if(b >= c && b >= d && b >= a){
            System.out.println(b);
        }
        else if(c >= d && c >= a && c >= b){
            System.out.println(c);
        }
        else if(d >= a && d >= b && d >= c){
            System.out.println(d);
        }
    }
}
