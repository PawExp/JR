package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception, NotAPositivNaturalNumber {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listX = new ArrayList<>();
        ArrayList<Integer> listY = new ArrayList<>();
        ArrayList <Integer> del = new ArrayList<>();
       // try {
            int x = Integer.parseInt(reader.readLine());
            int y = Integer.parseInt(reader.readLine());

            if (x < 1 || y < 1) {
                throw new NotAPositivNaturalNumber("Вы ввели не положительное натуральное число которое < 1");
            }


            int xx = x;
            int yy = y;
            int n = 2;

            while (xx > 1) {
                if (xx % n == 0) {
                    xx = xx / n;
                    listX.add(n);
                } else n++;
            }
//        for (Integer e:listX
//             ) {
//            System.out.println(e);
//        }
            n = 2;

            while (yy > 1) {
                if (yy % n == 0) {
                    yy = yy / n;
                    listY.add(n);
                } else n++;
            }


            for (int i = 0; i < listX.size(); i++) {
                for (int j = 0; j < listY.size(); j++) {
                    if (listX.get(i) == listY.get(j)) {
                        del.add(listX.get(i));
                        listX.set(i, -1);
                        listY.set(j, -2);
                    }
                }
            }
//            for (Integer s : del
//            ) {
//                System.out.println(s);
//            }

            //Integer[] arr = del.toArray(new Integer[del.size()]);
            n = 1;
            for (int i = 0; i < del.size(); i++) {
                n = n * del.get(i);
            }
            System.out.println(n);
        //}
//        catch (Exception e){
//            if(e instanceof NumberFormatException) {
//                System.out.println("Вы ввели не число");
//            }else if (e instanceof NotAPositivNaturalNumber){
//                System.out.println(e.getMessage());
//            }
        //}



    }
}
