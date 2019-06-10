package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки,
две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human("Son1", true,5);
        Human son2 = new Human("Son2", true,10);
        Human son3 = new Human("Son3", true,15);
        Human mom = new Human("Mom", false,35);
        mom.children.add(son1);
        mom.children.add(son2);
        mom.children.add(son3);
        Human dad = new Human("Dad", true,40);
        dad.children.add(son1);
        dad.children.add(son2);
        dad.children.add(son3);
        Human gm1 = new Human("GM1", false,70);
        gm1.children.add(dad);
        Human gf1 = new Human("GF1", true,75);
        gf1.children.add(dad);
        Human gm2 = new Human("GM2", false,71);
        gm2.children.add(mom);
        Human gf2 = new Human("GF2", true,76);
        gf2.children.add(mom);
        ArrayList<Human> humans = new ArrayList<Human>();
        humans.add(mom);
        humans.add(dad);
        humans.add(son1);
        humans.add(son2);
        humans.add(son3);
        humans.add(gm1);
        humans.add(gm2);
        humans.add(gf1);
        humans.add(gf2);
        for (Human f:humans
             ) {
            System.out.println(f);

        }
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
