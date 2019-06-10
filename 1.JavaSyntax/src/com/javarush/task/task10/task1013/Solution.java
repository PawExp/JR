package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private boolean sex;
        private String firstName;
        private String secondName;
        private int age;
        private double weight;
        private double hight;

        public Human(String firstName, String secondName, int age, double weight, double hight) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.weight = weight;
            this.hight = hight;
        }

        public Human(boolean sex, String firstName, String secondName) {
            this.sex = sex;
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public Human(boolean sex, String firstName, String secondName, int age, double weight, double hight) {
            this.sex = sex;
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.weight = weight;
            this.hight = hight;
        }

        public Human(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }
        public Human(int age, String secondName, String firstName) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
        }

        public Human(String firstName, String secondName, int age) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
        }

        public Human(String firstName, String secondName, double weight) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.weight = weight;
        }

        public Human(boolean sex, int age) {
            this.sex = sex;
            this.age = age;
        }

        public Human(double weight, double hight) {
            this.weight = weight;
            this.hight = hight;
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }
    }
}
