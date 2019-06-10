package com.javarush.task.task14.task1421;

/* 
Singleton
*/
public class Solution {
    public static void main(String[] args) {
        Singleton r = Singleton.getInstance();
        Singleton t = Singleton.getInstance();
        System.out.println(r.equals(t));
    }
}
