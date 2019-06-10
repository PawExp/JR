package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        TeaMaker t = new TeaMaker();
        LatteMaker l = new LatteMaker();
        t.makeDrink();
        l.makeDrink();
    }
}
