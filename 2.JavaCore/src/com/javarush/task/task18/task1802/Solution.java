package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int i = inputStream.read();
        //System.out.println(i);
        while (inputStream.available()>0){
            int j = inputStream.read();
            //System.out.print(j + " ");
            if (i>j)i=j;
            //System.out.println(i);
        }
        System.out.println(i);
        inputStream.close();
    }
}
