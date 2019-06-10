package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        if (o.equals(new Cat()))
            return "Кот";

        if (o.equals(new Tiger())) return "Тигр";
        if (o.equals(new Lion())) return "Лев";
        if (o.equals(new Bull())) return "Бык";
        return "Животное";
    }

    public static class Cat {
        String name;


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Cat)) return false;
            Cat cat = (Cat) o;
            return Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Tiger {
        String name;


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Tiger)) return false;
            Tiger tiger = (Tiger) o;
            return Objects.equals(name, tiger.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public static class Lion {
        String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Lion)) return false;
            Lion lion = (Lion) o;
            return Objects.equals(name, lion.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public static class Bull {
        String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Bull)) return false;
            Bull bull = (Bull) o;
            return Objects.equals(name, bull.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public static class Pig {
        String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pig)) return false;
            Pig pig = (Pig) o;
            return Objects.equals(name, pig.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
