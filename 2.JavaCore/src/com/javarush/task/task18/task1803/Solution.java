package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis1 = new FileInputStream(reader.readLine());
        int[] arr = new int[256];
//        for (int i:arr) {
//            i = 0;
//        }
        while (fis1.available() > 0) {
            int rrr = fis1.read();
            for (int i = 0; i < 256; i++) {
                if (i == rrr) {
                    arr[i] = arr[i] + 1;
                }
            }
        }
        fis1.close();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        int counts = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > counts) {
                counts = arr[i];
                index = i;
            }
        }
        //System.out.println(counts + " ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[index] == arr[i]) {
                System.out.print(i + " ");
            }
        }
    }
}