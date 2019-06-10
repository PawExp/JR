package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if(this.strength > anotherCat.strength) return true;
        if(this.strength == anotherCat.strength && this.weight > anotherCat.weight) return true;
        if(this.strength == anotherCat.strength && this.weight == anotherCat.weight && this.age > anotherCat.age) return true;
            else return false;




    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setAge(12);
        cat1.setWeight(9);
        cat1.setStrength(5);

        Cat cat2 = new Cat();
        cat2.setAge(4);
        cat2.setWeight(8);
        cat2.setStrength(6);

        System.out.println(cat2.fight(cat1));


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
