package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
Требования:
1. Программа должна считывать c консоли имя файла.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();

            //FileInputStream fin = new FileInputStream(reader.readLine());
            BufferedInputStream buf = new BufferedInputStream(new FileInputStream(a));
            String s = "";
            while (buf.available() >0) {
                char c = (char) buf.read();
                s=s+c;
            }
            System.out.println(s);
            buf.close();
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e){
            e.printStackTrace();
        }



    }
}