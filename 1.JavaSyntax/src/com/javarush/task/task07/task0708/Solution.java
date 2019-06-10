package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++)
            strings.add(reader.readLine());
        String s1 = strings.get(0);
        String s2 = strings.get(0);

        for (int i = 1; i < strings.size(); i++){
            if(s1.length() <= strings.get(i).length())
                s1 = strings.get(i);
        }
        for(int i = 0; i < strings.size(); i++){
            if(s1.length() == strings.get(i).length())
                System.out.println(strings.get(i));
        }







    }
}
