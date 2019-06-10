package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(maxLong(list));

    }

    public static int maxLong(List list) {
        ArrayList<Integer> test = new ArrayList<>();
        int a = 1;
        int b = 1;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                a++;
                test.add(a);
            } else a = b; test.add(b);
        }
        return Collections.max(test);
    }
}