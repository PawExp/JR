package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(Solution.result.getClass().getSimpleName());
    }
    
    static {
        //add your code here - добавьте код тут
        try {
            reset();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if (s.equals("helicopter")){
            result = new Helicopter();
        }else if (s.equals("plane")){
            int pas = Integer.parseInt(reader.readLine());
            result = new Plane(pas);
        }
        reader.close();

        //add your code here - добавьте код тут
    }
}
