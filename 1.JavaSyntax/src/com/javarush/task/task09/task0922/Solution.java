package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import static java.util.Locale.ENGLISH;

/* 
Какое сегодня число?
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.


Требования:
1. Программа должна считывать данные с клавиатуры.
2. В программе должна быть объявлена переменная типа SimpleDateFormat.
3. В программе должна быть объявлена переменная типа Date.
4. Программа должна выводить данные на экран.
5. Вывод должен соответствовать заданию.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] arr = s.split("-");
        String[] months = {
                "JAN" , "FEB" , "MAR" , "APR" ,
                "MAY" , "JUN" , "JUL" , "AUG" ,
                "SEP" , "OCT" , "NOV" , "DEC" } ;

        Calendar calendar = new GregorianCalendar(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2]));
        Date date = new Date(/*Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2])*/);
        date.setYear(Integer.parseInt(arr[0]));
        date.setMonth(Integer.parseInt(arr[1]));
        date.setDate(Integer.parseInt(arr[2]));

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", ENGLISH);
        Date date1 = formatter.parse(s);
        formatter = new SimpleDateFormat("MMM dd, yyyy", ENGLISH);
//        System.out.println(months[calendar.get(Calendar.MONTH)-1] + " " + calendar.get(Calendar.DAY_OF_MONTH) + ", " + calendar.get(Calendar.YEAR));
//        System.out.println(months[date.getMonth()-1] + " " + date.getDate() + ", " + date.getYear());
//        System.out.println();
        System.out.println(formatter.format(date1).toUpperCase());
    }
}
