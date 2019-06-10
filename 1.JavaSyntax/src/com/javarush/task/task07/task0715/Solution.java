package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"мама", "мыла", "раму");
        for(int i = 1; i < list.size()+1; i = i+2)
            list.add(i,"именно");
        for (String x : list)   //быстрый for по всем элементам, только для коллекций
        {
            System.out.println(x);
        }

    }
}
