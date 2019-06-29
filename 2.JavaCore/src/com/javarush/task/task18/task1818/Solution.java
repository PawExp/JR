package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        FileInputStream fis2 = new FileInputStream(s2);
        FileInputStream fis3 = new FileInputStream(s3);

        FileOutputStream fos = new FileOutputStream(s1,true);
        int i;
        while ((i=fis2.read())>0){
            fos.write(i);
        }
        fis2.close();
        while ((i=fis3.read())>0){
            fos.write(i);
        }
        fis3.close();
        fos.close();



    }
}
