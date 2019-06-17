package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        int max = 0;
        while (fis.available()>0){
         // if (fis.read() != -1)
              int i = fis.read();
              //System.out.println(i);
            //System.out.print(i + " " + (char)i + "--");
          if (max < i) max = i;
          //System.out.println(" max " + max + " " + (char)max );

    }
        System.out.println(max);
        //System.out.println((char)max);
        fis.close();

    }
}
