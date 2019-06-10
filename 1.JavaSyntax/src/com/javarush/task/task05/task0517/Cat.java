package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;

    public Cat(int weight, String color){
        this.age = 3;
        this.color = color;
        this.weight = weight;

    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "grey";
        this.weight = 4;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "grey";
    }

    public Cat(String name) {
        this.name = name;
        this.color = "grey";
        this.age = 3;
        this.weight = 4;
    }

    public Cat(int weight, String color, String address) {
        this.address = address;
        this.color = color;
        this.weight = weight;
        this.age = 3;
    }

    public static void main(String[] args) {

    }
}
