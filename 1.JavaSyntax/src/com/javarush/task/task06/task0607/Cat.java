package com.javarush.task.task06.task0607;

/* 
Классовый счетчик
*/

public class Cat {
    //напишите тут ваш код
    static int catCount;

    public Cat(){
        catCount++;
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        Cat c4 = new Cat();
        Cat c5 = new Cat();
        Cat c6 = new Cat();
        Cat c7 = new Cat();
        Cat c8 = new Cat();
        System.out.println(Cat.catCount);

    }
}
