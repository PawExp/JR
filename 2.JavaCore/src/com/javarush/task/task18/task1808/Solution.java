package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        FileOutputStream fos1 = new FileOutputStream(reader.readLine());
        FileOutputStream fos2 = new FileOutputStream(reader.readLine());

        int fisAll = fis.available();// считывем количество байт в файле
        byte[] buf1;
        byte[] buf2;
        int fisAv;

        fisAv = fisAll / 2;
//            buf1 = new byte[fisAv];//первй буфер == половине количества байт
//            buf2 = new byte[fisAv + 1];//второй буфер на один байт больше на случай если число байт нечетное
//            System.out.println("buf1.length:" + buf1.length);
//            System.out.println("buf2.length:" + buf2.length);
        if (fisAll%2 == 0) {
            while (fis.available() > 0) {
//                System.out.println("while:" + fis.available());
                if (fis.available() > fisAv) {
                    int count = fis.read();
//                    System.out.println("count1: "+count);
                    fos1.write(count);
                } else if (fis.available() <= fisAv) {
                    int count = fis.read();
//                    System.out.println("count2: "+count);
                    fos2.write(count);
                }
            }
        } else {
            while (fis.available() > 0) {
//                System.out.println("while:" + fis.available());
                if (fis.available() > fisAv) {
                    int count = fis.read();
//                    System.out.println("count1: "+count);
                    fos1.write(count);
                } else if (fis.available() <= fisAv) {
                    int count = fis.read();
//                    System.out.println("count2: "+count);
                    fos2.write(count);
                }
            }
        }
        fis.close();
        fos1.close();
        fos2.close();
        reader.close();
//        System.out.println();
//        System.out.println(fisAll);
//        System.out.println(buf1.length);
//        System.out.println(buf2.length);

//        for(int i = 0; i < buf1.length; i++){
//            System.out.print(buf1[i] + " ");
//        }
//        System.out.println();
//        for(int i = 0; i < buf2.length; i++){
//            System.out.print(buf2[i] + " ");
//        }

    }
}
