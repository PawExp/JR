package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество
отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));

        int in1 = Integer.parseInt(reader.readLine());
        int in2 = Integer.parseInt(reader.readLine());
        int in3 = Integer.parseInt(reader.readLine());

        int a = 0;
        int b = 0;


        if(in1 > 0 && in2 > 0 && in3 > 0){
            b = b + 3;
        }
        else if(in1 < 0 && in2 < 0 && in3 < 0){
            a = a + 3;
        }
        else if(in1 < 0 && in2 > 0 && in3 > 0 || in1 > 0 && in2 < 0 && in3 > 0 || in1 > 0 && in2 > 0 && in3 < 0){
            b = b + 2;
            a = a + 1;
        }
        else if(in1 > 0 && in2 < 0 && in3 < 0 || in1 < 0 && in2 > 0 && in3 < 0 || in1 < 0 && in2 < 0 && in3 > 0){
            a = a + 2;
            b = b + 1;
        }


        else if(in1 == 0 && in2 > 0 && in3 > 0 || in1 > 0 && in2 == 0 && in3 > 0 || in1 > 0 && in2 > 0 && in3 == 0){
            b = b + 2;//два положительных и один ноль
        }
        else if(in1 == 0 && in2 == 0 && in3 > 0 || in1 > 0 && in2 == 0 && in3 == 0 || in1 == 0 && in2 > 0 && in3 == 0){
            b = b + 1;//одно положительное и два ноля
        }

        else if(in1 == 0 && in2 < 0 && in3 < 0 || in1 < 0 && in2 == 0 && in3 < 0 || in1 < 0 && in2 < 0 && in3 == 0){
            a = a + 2;//два отрицательных и один  ноль
        }
        else if(in1 == 0 && in2 == 0 && in3 < 0 || in1 < 0 && in2 == 0 && in3 == 0 || in1 == 0 && in2 < 0 && in3 == 0){
            a = a + 1;//два ноля и отрицательное
        }
        else if(in1 == 0 && in2 > 0 && in3 < 0 || in1 < 0 && in2 == 0 && in3 > 0 || in1 > 0 && in2 < 0 && in3 == 0){
            a = a + 1;//один ноль отр и полож
            b = b + 1;
        }
        else if(in1 == 0 && in2 < 0 && in3 > 0 || in1 > 0 && in2 == 0 && in3 < 0 || in1 < 0 && in2 > 0 && in3 == 0){
            a = a + 1;//один ноль отр и полож
            b = b + 1;
        }

        System.out.println("количество отрицательных чисел: " + a);
        System.out.println("количество положительных чисел: " + b);
    }
}
