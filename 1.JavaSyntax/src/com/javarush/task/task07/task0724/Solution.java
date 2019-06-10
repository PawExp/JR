package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grFather1 = new Human("Borya", true, 70);
        Human grFather2 = new Human("Vasya", true, 77);
        Human grMother1 = new Human("Klava", false, 69);
        Human grMother2 = new Human("Fekla", false, 76);
        Human father1 = new Human("Boris Borisovich", true, 40,grMother1,grFather1);
        Human mother2 = new Human("Fekla Vasilevna", false, 39,grMother2,grFather2);
        Human son1 = new Human("Borenka", true, 12,mother2,father1);
        Human son2 = new Human("Vasenka", true, 10,mother2,father1);
        Human doughter = new Human("Feklushka", true, 5,mother2,father1);
//        for(Human human : Human.humanList)
//        System.out.println(human);
        Human.printHuman(Human.humanList);


    }

    public static class Human {
        // напишите тут ваш код
        static ArrayList<Human> humanList = new ArrayList<>();
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            humanList.add(this);
        }

        public Human(String name, boolean sex, int age, Human mother, Human father) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
            humanList.add(this);
        }

        public static ArrayList<Human> getHumanList() {
            return humanList;
        }

        public static void printHuman(ArrayList<Human> list) {
            for(Human human : Human.humanList)
                System.out.println(human);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }

//        public static void printHuman ArrayList<Human> (getH){
//            for(Human human : Human.humanList)
//                System.out.println(human);
//        }


    }
}