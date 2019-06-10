package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] array = new int[20];
        int [] array1 = new int[10];
        int [] array2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(reader.readLine());
        System.arraycopy(array,0,array1,0,10);
        System.arraycopy(array,10,array2,0,10);
        for(int i = 0; i < array2.length; i++)
            System.out.println(array2[i]);
    }
}
