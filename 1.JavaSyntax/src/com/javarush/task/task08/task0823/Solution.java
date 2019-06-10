package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код

        char[] chars = s.toCharArray();
        if (Character.isAlphabetic(chars[0])) {
            chars[0] = Character.toUpperCase(chars[0]);
        }
        String result = "" + chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (Character.isAlphabetic(chars[i]) && !Character.isAlphabetic(chars[i - 1])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
            result = result + chars[i];
        }
        System.out.println(result);


    }

}
