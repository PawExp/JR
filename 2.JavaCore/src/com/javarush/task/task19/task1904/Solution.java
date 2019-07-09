package com.javarush.task.task19.task1904;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.*;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) /*throws ParseException*/ {
//        String d = "Иванов Иван Иванович 31 12 1950";
//        String[] spl = d.split(" ", 4);
//        for (int i = 0; i < spl.length; i++){
//            System.out.println(spl[i]);
//        }
//        System.out.println(spl.length);
//        String dd = "31 12 1950";
//        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
//        Date date = sdf.parse(dd);
//        System.out.println(date);
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String s = fileScanner.nextLine();
            String[] arr = s.split(" ",4);
            SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
            Date date = sdf.parse(arr[3]);

            return new Person(arr[1],arr[2],arr[0],date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
