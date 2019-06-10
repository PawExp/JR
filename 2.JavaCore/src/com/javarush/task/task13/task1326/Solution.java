package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла(FileInputStream).
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d = reader.readLine();

        FileInputStream fis = new FileInputStream(d);

        //BufferedReader reader1 = new BufferedReader(fis);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        String s = "";
        while (fis.available()>0){
            char c = (char) fis.read();
//            list.add(Integer.parseInt(s+c));
            s=s+c;
        }
        String[] strings = s.split("\n");
        String[] strings1 = new String[strings.length];

        for(int i = 0; i < strings.length; i++){
            strings1[i] = strings[i].trim();
    }
        for (int i = 0; i < strings1.length; i++) {
            int r = Integer.parseInt(strings1[i]);
            intList.add(r);
        }
        for (int i = 0; i < intList.size(); i++){
            if (intList.get(i)%2 == 0)list.add(intList.get(i));
        }
        Collections.sort(list);

        //System.out.println(s);
        for (Integer a: list)
            System.out.println(a);
        fis.close();
        reader.close();


    }
}
