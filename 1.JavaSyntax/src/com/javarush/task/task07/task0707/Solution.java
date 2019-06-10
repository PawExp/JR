package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> a = new ArrayList<>();

        a.add("q");
        a.add("qw");
        a.add("qwe");
        a.add("qwer");
        a.add("qwert");
        System.out.println(a.size());
        for(int i = 0; i < a.size(); i++)
            System.out.println(a.get(i));

    }
}
