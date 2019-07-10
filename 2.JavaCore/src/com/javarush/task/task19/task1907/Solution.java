package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        FileReader fileReader = new FileReader(reader.readLine());
        String s = "";
        int count = 0;
        while (fileReader.ready()){         //формируем строку из символов в файле
            int c = fileReader.read();      //
            if(c > 96 && c < 123) {
                s = s + (char) c;
            }else s = s + " ";              //если не буква то заменяем на пробел
        }

        String[]arr = s.split(" ");     //разделяем строку по пробелам

        for(String string:arr)
            if(string.equals("world"))count++;//сравниваем каждое слово с "world" если true то увеличиваем счетчик

        System.out.println(count);
        fileReader.close();
        reader.close();
    }
}
