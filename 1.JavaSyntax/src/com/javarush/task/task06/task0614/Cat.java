package com.javarush.task.task06.task0614;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<Cat>();
//    String name;

    public Cat() {
        //this.name = name;
//        Iterator<Cat> catIterator = cats.iterator();//создаем итератор
//        while(catIterator.hasNext()) {//до тех пор, пока в списке есть элементы
//
//            Cat nextCat = catIterator.next();//получаем следующий элемент
//            if (nextCat.name.equals("Филипп Маркович")) {
//                catIterator.remove();//удаляем кота с нужным именем
//            }
//        }


    }

    public static void main(String[] args) {

        //напишите тут ваш код

        for (int i = 0; i < 10; i++) {

            Cat.cats.add(new Cat());
        }
//        Cat murz = new Cat("Murzik");
//        Cat tom = new Cat("Tomas");
//        Cat barsik = new Cat("Barsik");
//        Cat murka = new Cat("Murka");
//        Cat masya = new Cat("Masyanya");
//        Cat cat = new Cat("Kotofey");
//        Cat kesha = new Cat("Enokentiy");
//        Cat kosha = new Cat("Kotya");
//        Cat manya = new Cat("Man'ka");
        //Cat.cats.add(name);
        printCats();

    }

    public static void printCats() {
        //напишите тут ваш код
        for (Cat cat : cats)
            System.out.println(cat);
    }

//    @Override
//    public String toString() {
//        return "" + name + "";
//    }
}
