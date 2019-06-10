package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.
Требования:
1. Список exceptions должен содержать 10 элементов.
2. Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
3. Все элементы списка exceptions должны быть уникальны.
4. Метод initExceptions должен быть статическим.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код


        try {
            FileInputStream fis = new FileInputStream("saf");
        } catch (IOException e) {
            exceptions.add(e);
        }

        try {
            int[] a = new int[2];
            a[4] = 2;
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            Solution a = new Solution();
            a.wait(Long.parseLong("6"));
        } catch ( InterruptedException e) {
            exceptions.add(e);
        }catch (IllegalMonitorStateException e){
            exceptions.add(e);
        }

        try {
            Object o = new Object();
            o = (Solution)o;
        } catch (ClassCastException e) {
            exceptions.add(e);
        }


        try {
            Object o = null;
            o.getClass();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            int i = Integer.parseInt(new String("w"));
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            String [] i = new String[-2];


        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {
            String i = "qwe";
            System.out.println(i.substring(5,6));

        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }


       Money money = new Money();
        money.clone();


    }
    static class Money {
        String name;

        public String getName() {
            return name;
        }
        public Money clone(){
            Money p = null;
            try {
                p = (Money) super.clone();
            } catch (CloneNotSupportedException e) {
                exceptions.add(e);
            }
            return p;
        }
    }
}
