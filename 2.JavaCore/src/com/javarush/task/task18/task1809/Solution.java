package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        FileOutputStream fos = new FileOutputStream(reader.readLine());

        byte[]buf = new byte[fis.available()];

        while (fis.available()>0){
            int count = fis.read(buf);
            byte[] temp = new byte[buf.length];
            for (int i = 0; i < buf.length; i++){
                temp[i] = buf[(buf.length-1)-i];
            }

            fos.write(temp,0,count);
        }
        fis.close();
        fos.close();

    }
}
