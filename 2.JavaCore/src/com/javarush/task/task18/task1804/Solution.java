package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        int[] byteArr = new int[255];
        for (int i = 0; i < byteArr.length; i++){
            byteArr[i] = -1;
        }
//        System.out.println(byteArr[0]);
        while (fis.available()>0){
            int f = fis.read();
            for (int i = 0; i < byteArr.length; i++){
                if (i == f) {
                    byteArr[i] = byteArr[i]+1;
                }
            }
        }
        fis.close();
//        for (int i: byteArr ) {
//            System.out.print(i + ":");
//        }
//        System.out.println();
        int min = 300;
        for (int i = 1; i < byteArr.length; i++){
            if (min >= byteArr[i] & byteArr[i] != -1)
                min = byteArr[i];
//            System.out.print(min + ",");
        }
//        System.out.println();
//        System.out.println(min);
        for (int i = 0; i < byteArr.length; i++){
            if (min == byteArr[i])
                System.out.print(i + " ");
        }

    }
}
