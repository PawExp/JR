package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
            strings.add(reader.readLine());
        String s1 = strings.get(0);
        String s2 = strings.get(0);

        for (int i = 1; i < strings.size(); i++) {
            if (s1.length() >= strings.get(i).length())
                s1 = strings.get(i);
        }
        for (int i = 0; i < strings.size(); i++) {
            if (s1.length() == strings.get(i).length())
                System.out.println(strings.get(i));
        }
    }
}
