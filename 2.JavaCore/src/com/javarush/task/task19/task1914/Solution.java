package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        //printSomething();
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
//        String result = outputStream.toString();

        //Возвращаем все как было
        System.setOut(consoleStream);

        //разворачиваем строку
//        StringBuilder stringBuilder = new StringBuilder(result);
        //stringBuilder.reverse();
        String[] te = outputStream.toString().split("\\p{Punct}\\p{Space}");
        for (int i = 0; i < te.length; i++){
            te[i] = te[i].trim();
        }

        //выводим ее в консоль
        if(outputStream.toString().contains("+")) {
            System.out.println(outputStream.toString().trim() + " " + (Integer.parseInt(te[0]) + Integer.parseInt(te[1])));
        }else if(outputStream.toString().contains("-")){
            System.out.println(outputStream.toString().trim() + " " + (Integer.parseInt(te[0]) - Integer.parseInt(te[1])));
        }else System.out.println(outputStream.toString().trim() + " " + (Integer.parseInt(te[0]) * Integer.parseInt(te[1])));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

