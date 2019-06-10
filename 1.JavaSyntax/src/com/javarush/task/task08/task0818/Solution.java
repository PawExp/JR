package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей

Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10
записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("Плюшкин", 500);
        mapa.put("Плюшки", 400);
        mapa.put("Плюшк", 500);
        mapa.put("Плюш", 500);
        mapa.put("Плю", 300);
        mapa.put("Плюшкина", 500);
        mapa.put("Плюшкину", 500);
        mapa.put("Плюшкино", 500);
        mapa.put("Плюшкинф", 500);
        mapa.put("Плюшкинц", 500);
        return mapa;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        map.entrySet().removeIf(m -> m.getValue() < 500);
//        for (Map.Entry<String, Integer> n : map.entrySet()) {
//            System.out.println(n);
//        }
    }

    public static void main(String[] args) {
        //removeItemFromMap(createMap());

    }
}