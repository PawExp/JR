package com.javarush.task.task08.task0815;

import java.security.KeyStore;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        map.put("Иванов","Иван");
        map.put("Петров","Петр");
        map.put("Сидоров","Сидор");
        map.put("Утюгов","Виталя");
        map.put("Кпро","Витал");
        map.put("Кутиков","Петр");
        map.put("Новиков","Виталя");
        map.put("Лебедев","Виталя");
        map.put("Каву","Иван");
        map.put("Крикунов","Дон");
return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int countName = 0;
        for (String s : map.values()) {
            if (name.equals(s)) countName++;
        }
return countName;
    }


    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int countLastName = 0;
        if (map.containsKey(lastName)) countLastName++;

        return countLastName;
    }

    public static void main(String[] args) {
//       int u = getCountTheSameFirstName(createMap(),"Виталя");
//        System.out.println(u);
//       //System.out.println(getCountTheSameLastName(createMap(),"Сидоров"));
//
//
//        for (Map.Entry<String, String> s : createMap().entrySet()){
//            System.out.println(s);
//        }
//        for (String s : createMap().values()) {
//            System.out.println(s);
//        }

        //System.out.println(getCountTheSameLastName(createMap(),"Сидоров"));
    }
}
