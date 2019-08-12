package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Person() {
        }
        
        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(getMother());
            out.writeObject(getFather());
            out.writeUTF(getFirstName());
            out.writeUTF(getLastName());
            out.writeInt(getAge());
            out.writeObject(getChildren());
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
           setMother((Person)in.readObject());
           setFather((Person)in.readObject());
           setFirstName(in.readUTF());
           setLastName(in.readUTF());
           setAge(in.readInt());
           setChildren((List<Person>) in.readObject());

        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person getMother() {
            return mother;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public Person getFather() {
            return father;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public List<Person> getChildren() {
            return children;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", mother=" + mother +
                    ", father=" + father +
                    ", children=" + children +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return age == person.age &&
                    Objects.equals(firstName, person.firstName) &&
                    Objects.equals(lastName, person.lastName) &&
                    Objects.equals(mother, person.mother) &&
                    Objects.equals(father, person.father) &&
                    Objects.equals(children, person.children);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName, age, mother, father, children);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person person1 = new Person("ivan", "Ivanov", 22);
        person1.father = new Person("Petr","Ivanov",60);
        person1.mother = new Person("Klava","Ivanova",55);
        person1.children = new ArrayList<>();
        person1.children.add(new Person("Seva","ivanov",2));
        person1.children.add(new Person("Sema","ivanov",1));

        FileOutputStream fos = new FileOutputStream("test");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person1);
        FileInputStream fis = new FileInputStream("test");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person2 = (Person) ois.readObject();
        System.out.println(person1.equals(person2));
        System.out.println(person1);
        System.out.println(person2);
    }
}
