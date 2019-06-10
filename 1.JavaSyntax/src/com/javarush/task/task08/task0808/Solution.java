package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        Date date1 = new Date();
        insert10000(arrayList);
        Date date2 = new Date();


        Date date5 = new Date();
        get10000(arrayList);
        Date date6 = new Date();


        Date date8 = new Date();
        set10000(arrayList);
        Date date9 = new Date();


        Date date10 = new Date();
        remove10000(arrayList);
        Date date11 = new Date();


        // LinkedList
        LinkedList linkedList = new LinkedList();
        Date date3 = new Date();
        insert10000(linkedList);
        Date date4 = new Date();


        Date date7 = new Date();
        get10000(linkedList);
        Date date16 = new Date();


        Date date14 = new Date();
        set10000(linkedList);
        Date date15 = new Date();


        Date date12 = new Date();
        remove10000(linkedList);
        Date date13 = new Date();
        System.out.println(date2.getTime() - date1.getTime() + "ms\t insert ArrayList");
        System.out.println(date4.getTime() - date3.getTime() + "ms\t insert LinkedList");
        System.out.println(date6.getTime() - date5.getTime() + "ms \t get ArrayList");
        System.out.println(date16.getTime() - date7.getTime() + "ms\t get LinkedList");
        System.out.println(date9.getTime() - date8.getTime() + "ms\t set ArrayList");
        System.out.println(date15.getTime() - date14.getTime() + "ms\t set LinkedList");
        System.out.println(date11.getTime() - date10.getTime() + "ms \t remove ArrayList");
        System.out.println(date13.getTime() - date12.getTime() + "ms \t remove LinkedList");


    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        for(int i = 0; i <100000; i++){
            list.add(i);
        }

    }

    public static void get10000(List list) {
        //напишите тут ваш код
        for(int i = 0; i <100000; i++){
            list.get(i);
        }

    }

    public static void set10000(List list) {
        //напишите тут ваш код
        for(int i = 99999; i >= 0; i--){
            list.set(i,i);
        }

    }

    public static void remove10000(List list) {
        //напишите тут ваш код
        for(int i = list.size()-1; i >= 0 ; i--) list.remove(i);

    }
}
