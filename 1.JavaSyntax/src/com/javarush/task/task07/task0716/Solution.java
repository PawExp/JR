package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);
//        String w = list.get(2);
//        if (w.contains("р") && w.contains("л")) {
//                list.add(w);
//            }


        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();


        for(int i = 0; i < list.size(); i++){
            if (list.get(i).contains("р") && !list.get(i).contains("л")) {
                list1.add(list.get(i));

            }
            else if (list.get(i).contains("л") && !list.get(i).contains("р")) {
                list2.add(0,list.get(i));
                list2.add(0,list.get(i));


            }else list2.add(0,list.get(i));
        }
//        for (int i = 0; i < list.size(); i++){
//            if(list.get(i).contains("л") && !list.get(i).contains("р")) list.add(list.get(i));
//        }
        return list2;
    }
}