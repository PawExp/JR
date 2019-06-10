package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int b = number%10;//6
        int c = (int) ((number-b)*0.1)%10;//4
        int d = (int) ((((number-b)*0.1) - c)*0.1);
        return b+c+d;
    }
}