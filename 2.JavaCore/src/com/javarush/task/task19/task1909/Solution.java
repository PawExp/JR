package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(reader.readLine()));
//        StringBuilder stringBuilder = new StringBuilder();


        while (fileReader.ready()) {
            int c = fileReader.read();
            if(c == '.'){fileWriter.write('!');}
            else {fileWriter.write(c);}

        }

//        Pattern p = Pattern.compile("\\b\\d+\\b");
//        Matcher m = p.matcher(s);
//        while (m.find()){
//            fileWriter.write(m.group() + " ");
//        }

        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
