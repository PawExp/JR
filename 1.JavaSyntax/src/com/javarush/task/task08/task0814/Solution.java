package com.javarush.task.task08.task0814;

import java.util.*;

/* 
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createSet() должен создавать и возвращать множество HashSet состоящих из 20 различных чисел.
5. Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        set.add(20);

return (HashSet<Integer>) set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код
//        ArrayList<Integer> list = new ArrayList<>();
//        list.addAll(set);
//        for (int i = list.size()-1; i > 0; i--) {
//            if(list.get(i)>10)list.remove(i);
//        }
        set.removeIf(i -> i>10);


return set;
    }

    public static void main(String[] args) {
        //System.out.println(removeAllNumbersGreaterThan10(createSet()));

    }
}
