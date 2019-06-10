package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int aAge = Integer.parseInt(reader.readLine());
//        String name = reader.readLine();

        InputStreamReader reader1 = new InputStreamReader(new FileInputStream("D:\\Привет.txt"));
        System.out.println(reader1);



//        System.out.println(name + " захватит мир через " + aAge + " лет. Му-ха-ха!");


    }
}
