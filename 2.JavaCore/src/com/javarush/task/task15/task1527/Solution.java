package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String f = reader.readLine();
        System.out.println(parametrs(f));
        if (f.contains("obj")) {
            try {
                alert(Double.parseDouble(obj(f)));
            } catch (Exception e) {
                alert(obj(f));
            }
        }
        reader.close();
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

    public static String parametrs(String url) {
        String str1 = "";
        String str = "";

        for (int i = 0; i < url.length(); i++) {
            if (url.charAt(i) == '?') {
                for (int j = url.indexOf('?') + 1; j < url.length(); j++)
                    str += url.charAt(j);
            }
        }
        String[] sarr = str.split("&");
        for (int i = 0; i < sarr.length; i++) {
            for (int j = 0; j < sarr[i].length(); j++) {
                if (sarr[i].charAt(j) == '=') break;
                str1 += sarr[i].charAt(j);
            }
            str1 += " ";
        }
        return str1;
    }

    public static String obj(String s) {
        String str = "";
        String[] arr = s.split("obj");
        for (int i = 1; i < arr.length; i++) {//откидываем часть строки до  obj
            for (int j = 1; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == '&') break;
                str += arr[i].charAt(j);
            }
        }
        return str;
    }
}
