package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(args[0]);
        int countSpase = 0;
        int countLeters = 0;
        int i;
        while((i=reader.read())>0){
            if(i == ' '){
                countSpase++;
            } else countLeters++;
        }
        reader.close();
        //double d = Math.round(((double)countSpase/countLeters)*100)/100.0;
        double d = ((double)countSpase/(countLeters+countSpase))*100;
//        System.out.println(countSpase);
//        System.out.println(countLeters);
        System.out.printf(Locale.ENGLISH, "%.2f", d);

    }
}
