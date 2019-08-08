package com.javarush.task.task20.task2011;

import java.io.*;
import java.util.Objects;

/*
Externalizable для апартаментов
*/
public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() { super(); }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            address = (String)in.readObject();
            year = in.readInt();
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof Apartment)) return false;
//            Apartment apartment = (Apartment) o;
//            return year == apartment.year &&
//                    address.equals(apartment.address);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(address, year);
//        }
    }

    public static void main(String[] args)  {

       /* Apartment apartment = new Apartment();
        apartment.address = "ADDRESS";
        apartment.year = 2019;

       try(FileOutputStream fos = new FileOutputStream("test");
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {
           oos.writeObject(apartment);
       } catch (IOException e) {
           e.printStackTrace();
       }

       try(FileInputStream fis = new FileInputStream("test");
       ObjectInputStream ois = new ObjectInputStream(fis)){
           Apartment apartment1 = (Apartment)ois.readObject();
           System.out.println(apartment1);
           System.out.println(apartment.equals(apartment1));
       } catch (IOException | ClassNotFoundException e) {
           e.printStackTrace();
       }
       // System.out.println(apartment);*/

    }
}
