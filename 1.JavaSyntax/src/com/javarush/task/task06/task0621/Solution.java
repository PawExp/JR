package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grFatherName = reader.readLine();
        Cat grandFather = new Cat(grFatherName);

        String grMotherName = reader.readLine();
        Cat grandMother = new Cat(grMotherName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, grandFather);

        String motherName = reader.readLine();
        Cat mother = new Cat(grandMother, motherName);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, mother, father);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, mother, father);


        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father) {
            this.name = name;
            this.father = father;
        }

        public Cat(Cat mother, String name) {
            this.mother = mother;
            this.name = name;

        }

        public Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (father == null && mother == null) {
                return "The cat's name is " + name + ", no mother, no father";
            } else if (father == null) {
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            } else if (mother == null) {
                return "The cat's name is " + name + ", no mother" + ", father is " + father.name;
            } else return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;

        }
    }

}
