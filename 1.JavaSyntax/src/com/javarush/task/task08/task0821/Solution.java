package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String,String> list = new HashMap<>();
        list.put("Иванов", "Иван");
        list.put("Петров", "Иван");
        list.put("Сидоров", "Петр");
        list.put("Плюшкин", "Павел");
        list.put("Баранкин", "Вова");
        list.put("Бубликов", "Миша");
        list.put("Буше", "Дима");
        list.put("Блинов", "Костя");
        list.put("Трубочкин", "Иван");
        list.put("Иванов", "Иван");
        return list;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
