package com.javarush.task.task17.task1711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* 
CRUD 2
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException, IOException {
        //start here - начни тут
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //String[] args1 = reader.readLine().split(" ");
        switch (args[0]){
            case "-c":
                synchronized (allPeople) {
                    for (int i = 0, j = 0; i < (args.length - 1) / 3; i++, j += 3) {
                        if (args[2 + j].equals("м"))
                            allPeople.add(Person.createMale(args[1 + j], sdf.parse(args[3 + j])));
                        if (args[2 + j].equals("ж"))
                            allPeople.add(Person.createFemale(args[1 + j], sdf.parse(args[3 + j])));

                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 0, j = 0; i < (args.length - 1) / 4; i++, j += 4) {
                        if (args[3 + j].equals("м"))
                            allPeople.set(Integer.parseInt(args[1 + j]), Person.createMale(args[2 + j], sdf.parse(args[4 + j])));
                        if (args[3 + j].equals("ж"))
                            allPeople.set(Integer.parseInt(args[1 + j]), Person.createFemale(args[2 + j], sdf.parse(args[4 + j])));
                    }
                    System.out.println(allPeople.get(0));
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 0, j = 0; i < (args.length - 1); i++, j += 1) {
                        allPeople.get(Integer.parseInt(args[1 + j])).setName(null);
                        allPeople.get(Integer.parseInt(args[1 + j])).setSex(null);
                        allPeople.get(Integer.parseInt(args[1 + j])).setBirthDate(null);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 0, j = 0; i < (args.length - 1); i++, j += 1) {
                        System.out.println(allPeople.get(Integer.parseInt(args[1 + j])));
                    }
                }
                break;

        }

    }
}
