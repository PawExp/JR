package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        FileInputStream fis = new FileInputStream(s1);
        int i;
        String s = "";

        while((i=fis.read())!= -1){         //create String from chars
            s = s + (char)i;
        }
        fis.close();
        String[] arr = s.split(" ");
        String ints = "";
        for(int g = 0; g < arr.length; g++){
            int d = (int)Math.round(Double.parseDouble(arr[g]));

            ints = ints + d + " ";
        }
        FileOutputStream fos = new FileOutputStream(s2);
        fos.write(ints.getBytes());
        fos.close();
        reader.close();
    }
}
