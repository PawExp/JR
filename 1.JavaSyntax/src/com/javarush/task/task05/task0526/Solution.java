package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Vasya",21,"Mosc");
        Man man2 = new Man("Petya",22,"SPB");
        Woman w1 = new Woman("Manya",23,"Mosc");
        Woman w2 = new Woman("Gadya",32,"KHV");
        System.out.println(man1.toString());

        System.out.println(man2.objInformation());
        System.out.println(w1);
        System.out.println(w2);

    }




    //напишите тут ваш код
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name, int age) {
            this(name,age, "wdpol");

        }

        public Man(Man man) {
            age = man.age;
            address = man.address;
            name = man.name;
        }
        public String objInformation (){

            return name + " " + age + " " + address;
        }
//        public String toString() {
//            return name + " " + age + " " + address;
//        }
    }
    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(String name, int age) {
            this(name,age, "wdpol");

        }

        public Woman(Woman woman) {
            age = woman.age;
            address = woman.address;
            name = woman.name;
        }
        public String objInformation (){

            return name + " " + age + " " + address;
        }
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

}
