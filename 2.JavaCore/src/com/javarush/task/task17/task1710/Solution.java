package com.javarush.task.task17.task1710;

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
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

        System.out.println(
                "Доступны 5 команд: \n" +
                        "\"-c\" - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран \n" +
                        "\"-u\" - обновляет данные человека с данным id \n" +
                        "\"-d\" - производит логическое удаление человека с id, заменяет все его данные на null \n" +
                        "\"-i\" - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)\n" +
                        "\"exit\" - выход из программы \n" +
                        "Примеры ввода: \n" +
                        "-c Иванов м \"dd/mm/yyyy\"\n" +
                        "-u номер Иванова ж \"dd/mm/yyyy\" \n" +
                        "-d номер \n" +
                        "-i номер \n" +
                        "Введите команду:");

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = null;
        Sex sex;
        Date bd;
        int id;
        f:
        while (true) {
            try {
                String s = reader.readLine();
                if (s.equals("exit")) {
                    break;
                } else {
                    String[] strings = s.split(" ");

                    if (strings[0].equals("-c") && strings.length == 4) {
                        if (strings[2].equals("м")) {
                            name = strings[1];
                            String[] date = strings[3].split("/");
                            if (date.length < 3) {
                                System.out.println("Дата введена не верно");
                                continue f;
                            }

                                if ((Integer.parseInt(date[0]) < 1 || Integer.parseInt(date[0]) > Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH)) ||
                                        (Integer.parseInt(date[1]) < 1 || Integer.parseInt(date[1]) > Calendar.getInstance().getActualMaximum(Calendar.MONTH) + 1) ||
                                        (Integer.parseInt(date[2]) < 1900 || Integer.parseInt(date[2]) > Calendar.getInstance().get(Calendar.YEAR))) {
                                    System.out.println("Дата введена не верно");
                                    continue f;
                                }

                            calendar.setTime(sdf.parse(strings[3]));
                            allPeople.add(Person.createMale(name, calendar.getTime()));
                            System.out.println("id:" + (allPeople.size() - 1));
                        } else if (strings[2].equals("ж")) {
                            name = strings[1];
                            String[] date = strings[3].split("/");
                            if (date.length < 3) {
                                System.out.println("Дата введена не верно");
                                continue f;
                            }
                            if ((Integer.parseInt(date[0]) < 1 || Integer.parseInt(date[0]) > Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH)) ||
                                    (Integer.parseInt(date[1]) < 1 || Integer.parseInt(date[1]) > Calendar.getInstance().getActualMaximum(Calendar.MONTH) + 1) ||
                                    (Integer.parseInt(date[2]) < 1 || Integer.parseInt(date[2]) > Calendar.getInstance().get(Calendar.YEAR))) {
                                System.out.println("Дата введена не верно");
                                continue f;
                            }
                            calendar.setTime(sdf.parse(strings[3]));
                            allPeople.add(Person.createFemale(name, calendar.getTime()));
                            System.out.println("id:" + (allPeople.size() - 1));
                        } else {
                            System.out.println("Пол введен не верно! Повторите ввод.");
                        }

                    } else if (strings[0].equals("-u") && strings.length == 5) {
                        if (strings[3].equals("м")) {
                            name = strings[2];
                            bd = sdf.parse(strings[4]);
                            allPeople.set(Integer.parseInt(strings[1]), (Person.createMale(name, bd)));
                        } else if (strings[3].equals("ж")) {
                            name = strings[2];
                            bd = sdf.parse(strings[4]);
                            allPeople.set(Integer.parseInt(strings[1]), (Person.createFemale(name, bd)));
                        } else {
                            System.out.println("Пол введен не верно! Повторите ввод.\n При вводе пола указывайте \"м\" или \"ж\".");
                        }
                    } else if (strings[0].equals("-d") && strings.length == 2) {
                        allPeople.get(Integer.parseInt(strings[1])).setName(null);
                        allPeople.get(Integer.parseInt(strings[1])).setSex(null);
                        allPeople.get(Integer.parseInt(strings[1])).setBirthDate(null);
                    } else if (strings[0].equals("-i") && strings.length == 2) {
                        System.out.println(allPeople.get(Integer.parseInt(strings[1])));
                    } else
                        System.out.println(
                                "Доступны 5 команд: \n" +
                                        "\"-c\" - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран \n" +
                                        "\"-u\" - обновляет данные человека с данным id \n" +
                                        "\"-d\" - производит логическое удаление человека с id, заменяет все его данные на null \n" +
                                        "\"-i\" - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)\n" +
                                        "\"exit\" - выход из программы \n" +
                                        "Примеры ввода: \n" +
                                        "-c Иванов м \"dd/mm/yyyy\"\n" +
                                        "-u номер Иванова ж \"dd/mm/yyyy\" \n" +
                                        "-d номер \n" +
                                        "-i номер \n" +
                                        "Введите команду:");
                }
            } catch (ParseException e) {
                System.out.println("Дата введена не верно! \n Повторите ввод. \n Формат ввода даты: dd/mm/yyyy");
            }
            catch (NumberFormatException e) {
                System.out.println("Дата введена не верно! \n Повторите ввод. \n Формат ввода даты: dd/mm/yyyy");
            }catch (RuntimeException e){
                System.out.println("Такой id не зарегистрирован");

            }catch (IOException e){

            }

        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
