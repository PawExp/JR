package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        //int count = 1;
        while (fileReader.read()>0){
            int data = fileReader.read();
            fileWriter.write(data);
        }
        fileWriter.close();
        fileReader.close();
        reader.close();
    }
}
