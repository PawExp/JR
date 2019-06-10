package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    //напишите тут ваш код
    String name;
    int age;
    char sex;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public static void main(String[] args) {
        Friend f1 = new Friend();
        f1.initialize("Vasya");
        f1.initialize("Petya",18, 'm');
        System.out.println(f1.name);

    }
}
