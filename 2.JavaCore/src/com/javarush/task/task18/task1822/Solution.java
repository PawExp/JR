package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   //read file name
        FileInputStream fis = new FileInputStream(reader.readLine());                   //read file name
        BufferedReader line = new BufferedReader( new InputStreamReader(fis));          //read strings from file

        while (line.ready()){                                                           //while we have something to read from file
            String s;
            if((s = line.readLine()).startsWith(args[0] + " ")){
                System.out.println(s);
            }
        }
        reader.close();
        fis.close();
        line.close();
    }
}


