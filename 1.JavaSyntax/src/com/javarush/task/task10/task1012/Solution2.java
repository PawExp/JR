package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;
/*
Количество букв
*/

public class Solution2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        TreeMap<Object,Integer> result = new TreeMap<Object,Integer>();

        String s = "";

        int sum = 0;

        for(String i : list){
            s = s + i;
        }

        for(int i = 0; i < abc.length(); i++) {
            result.put(abc.charAt(i) , 0);
        }
        HashMap<Object,Integer> map = new HashMap<>();

        for(Map.Entry<Object,Integer> pair : result.entrySet()){
            Object key = pair.getKey();
            int value = 0;
            for(int j = 0; j < s.length(); j ++){

                char jj = s.charAt(j);

                if(key.equals(jj)) {
                    value++;
                }

            }
            map.put(key,value);
        }

        for(Map.Entry<Object,Integer> pair : map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

}
