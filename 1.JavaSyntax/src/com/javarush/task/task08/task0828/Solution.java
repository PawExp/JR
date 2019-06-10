package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.
January, February, March, April, May, June, July, August, September, October, November, December

Требования:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        HashMap<String,String> map = new HashMap<>();
        map.put("January","January is the 1 month");
        map.put("February","February is the 2 month");
        map.put("March","March is the 3 month");
        map.put("April","April is the 4 month");
        map.put("May","May is the 5 month");
        map.put("June","June is the 6 month");
        map.put("July","July is the 7 month");
        map.put("August","August is the 8 month");
        map.put("September","September is the 9 month");
        map.put("October","October is the 10 month");
        map.put("November","November is the 11 month");
        map.put("December","December is the 12 month");
        for (Map.Entry<String,String> m: map.entrySet()) {
            if(month.equalsIgnoreCase(m.getKey())) System.out.println(m.getValue());
        }
    }
}
