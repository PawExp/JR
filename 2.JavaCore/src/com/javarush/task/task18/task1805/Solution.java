package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        HashSet <Integer> set = new HashSet<>();
        while (fis.available()>0){
            int b = fis.read();
            set.add(b);
        }
        fis.close();

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
