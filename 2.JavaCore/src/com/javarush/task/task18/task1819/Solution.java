package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        FileInputStream fis1 = new FileInputStream(s1);

        byte[] b1 = new byte[fis1.available()];         // массив байт первого файла
        int i = 0;
        while (fis1.available() > 0) {
            i = fis1.read(b1);
        }
        fis1.close();

        FileInputStream fis2 = new FileInputStream(s2);
        byte[] b2 = new byte[fis2.available()];         //массив байт второго файла
        int j = 0;
        while (fis2.available() > 0) {
            j = fis2.read(b2);
        }
        fis2.close();

        int ww = i + j;
        byte[] all = new byte[b2.length + b1.length];   //общий массив
        for (int t = 0; t < b2.length; t++) {           //добавляем второй массив
            all[t] = b2[t];
        }
        for (int t = b2.length, y = 0; t < all.length; t++, y++) {//добавляем первый массив после второго
            all[t] = b1[y];
        }
        FileOutputStream fos = new FileOutputStream(s1);
        fos.write(all, 0, ww);                      //выводим общий массив в первый файл
        fos.close();


    }
}
