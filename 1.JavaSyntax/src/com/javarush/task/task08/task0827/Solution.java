package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("D");
//        Date date = new Date ("MAY 2 2013");
//        System.out.println(dateFormat.format(date));
        System.out.println(isDateOdd("MAY 2 2013"));
    }

    public static boolean isDateOdd(String date) {
    //    Date currentDate = new Date(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("D");
        int q = Integer.parseInt(dateFormat.format(new Date(date)));
        if(q%2 == 1)
        return true;
        else return false;
    }
}
