package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws IOException {
        //start here - начни тут
        System.out.println(
                "Доступны 4 команды: \n" +
                        "\"-c\" - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран \n" +
                        "\"-u\" - обновляет данные человека с данным id \n" +
                        "\"-d\" - производит логическое удаление человека с id, заменяет все его данные на null \n" +
                        "\"-i\" - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)\n" +
                        "Введите команду:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        allPeople.add(Person.createFemale(reader.readLine(),));




    }
}
