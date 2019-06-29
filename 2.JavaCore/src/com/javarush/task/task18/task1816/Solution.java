package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream bis = (new FileInputStream(args[0]));
        int i;
        int count = 0;
        while ((i=bis.read())>0){
            if((i>='a'&& i <='z') || (i >= 'A' && i <= 'Z')) count ++;
        }
        bis.close();
        System.out.println(count);
    }
}
