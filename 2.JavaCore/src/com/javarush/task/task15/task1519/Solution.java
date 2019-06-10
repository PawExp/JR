package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = reader.readLine();
            if(s.equals("exit")) break;
            //String[] arr = s.split(" ");
            if(numeralOrNot(s) && s.contains(".")){
                Double d = Double.parseDouble(s);
                print(d);
            } else if(numeralOrNot(s) && (Integer.parseInt(s) > 0 && Integer.parseInt(s)  < 128)){
                Short sh = (short)Integer.parseInt(s);
                print(sh);
            }else if (numeralOrNot(s)
                    && (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128)){
                Integer i = Integer.parseInt(s);
                print(i);
            }else print(s);
        }
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '-') count++;
            if (!Character.isDigit(str.charAt(i)) && str.charAt(i) != '-' || count > 1) return false;
        }
        return true;
    }
    private static boolean numeralOrNot(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int commaCount = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '.') {
                commaCount++;
            }
            if (str.charAt(i) == '-') {
                count++;
            }

            if ((!Character.isDigit(str.charAt(i)) && str.charAt(i) != '.' && str.charAt(i) != '-') || commaCount > 1 || count > 1)
            {
                return false;
            }
        }

        return true;
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
