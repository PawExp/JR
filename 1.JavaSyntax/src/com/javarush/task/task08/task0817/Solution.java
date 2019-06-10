package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> mapa = new HashMap<>();
        mapa.put("Иванов","Сидор");
        mapa.put("Петров","Петр");
        mapa.put("Сидоров","Сидор");
        mapa.put("Утюгов","Виталя");
        mapa.put("Кпро","Петр");
        mapa.put("Кутиков","Пётр");
        mapa.put("Новиков","Виталя");
        mapa.put("Лебедев","Виталя");
        mapa.put("Каву","Иван");
        mapa.put("Крикунов","Дон");
        return mapa;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String,String> m: map.entrySet()) {
            list.add(m.getValue());
        }
       //System.out.println(list);
        for (int i = list.size() - 1; i > 0; i --) {
            for (int x = 0; x < list.size()-1; x++) {

                if (list.get(i).equals(list.get(x)) && x !=i) removeItemFromMapByValue(map, list.get(i));
            }
        }
//        for (Map.Entry<String,String> ee: map.entrySet()) {
//            System.out.println(ee);
//        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

       // removeTheFirstNameDuplicates(createMap());
    }
}
