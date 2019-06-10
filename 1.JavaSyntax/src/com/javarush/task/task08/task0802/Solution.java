package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String,String> mapa = new HashMap<>();
        mapa.put("арбуз","ягода");
        mapa.put("банан","трава");
        mapa.put("вишня","ягода");
        mapa.put("груша","фрукт");
        mapa.put("дыня","овощ");
        mapa.put("ежевика","куст");
        mapa.put("жень-шень","корень");
        mapa.put("земляника","ягода");
        mapa.put("ирис","цветок");
        mapa.put("картофель","клубень");
        for (Map.Entry<String, String> pair : mapa.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + " - " + value);
        }


    }
}
