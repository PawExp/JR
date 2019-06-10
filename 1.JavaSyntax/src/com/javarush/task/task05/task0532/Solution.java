package com.javarush.task.task05.task0532;

import java.io.*;
import java.lang.reflect.Array;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int minimum = 0;
//        System.out.println("Введите количество чисел");
        int n = Integer.parseInt(reader.readLine());
        if(n>0){
            int [] array = new int[n];

//            System.out.println("Введите числа");
            for (int x = 0; x<n; x++){
                array[x] = Integer.parseInt(reader.readLine());
            }
            int max = array[0];
            int min = array[0];

            for(int i = 0; i < n; i++){
//                System.out.println("max before" + max);
                if (array[i] >= max){
                    max = array[i];
//                    System.out.println("max after" + max);
                }else if (array[i] <= min) {min = array[i];}
            }
            maximum = max;
        }
        //напишите тут ваш код
        System.out.println(maximum);
    }
}
