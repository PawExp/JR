package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        //int num = x;
//        if (num >= 0 && num < 10) {
//            int a = num % 2;
//            if (a > 0) Solution.odd++;
//            else Solution.even++;
//        } else if (num >= 10 && num < 100) {
//            int a = num % 10;
//            int b = num / 10;
//            if (a%2 > 0) Solution.odd++;
//            else Solution.even++;
//            if (b%2 > 0) Solution.odd++;
//            else Solution.even++;
//        } else if (num >= 100 && num < 1000) {
//            int a = num % 10;
//            int b = num / 100;
//            int c = num % 100 / 10;
//            if (a%2 > 0) Solution.odd++;
//            else Solution.even++;
//            if (b%2 > 0) Solution.odd++;
//            else Solution.even++;
//            if (c%2 > 0) Solution.odd++;
//            else Solution.even++;
//
//        } else if (num >= 1000 && num < 10000) {
//            int a = num % 10;
//            int b = num / 1000;
//            int c = num % 100 / 10;
//            int d = num % 1000 / 100;
//            if (a%2 > 0) Solution.odd++;
//            else Solution.even++;
//            if (b%2 > 0) Solution.odd++;
//            else Solution.even++;
//            if (c%2 > 0) Solution.odd++;
//            else Solution.even++;
//            if (d%2 > 0) Solution.odd++;
//            else Solution.even++;
//        //    System.out.println(a + " " + b + " " + c + " " + d);
//        }
        while (num!=0){
            if (num%2==0) even++;
            else odd++;
            num = num/10;
        }
        System.out.println("Even: " + Solution.even + " Odd: " + Solution.odd);
    }
}
