package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int [] charTypes = new int[255];
        for(int s: charTypes){
            s = 0;
        }
        while (fis.available()>0){
            int c = fis.read();
            for(int i = 0; i < charTypes.length; i++){
                if (c == i) charTypes[i] = charTypes[i] + 1;
            }
        }
        fis.close();
        for (int i = 0; i < charTypes.length; i++){
            if(charTypes[i] !=0) System.out.println((char)i + " " + charTypes[i]);
        }

    }
}
