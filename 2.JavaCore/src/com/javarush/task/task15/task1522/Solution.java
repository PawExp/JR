package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.javarush.task.task15.task1522.Planet.*;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(thePlanet);

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String planet = reader.readLine();
        switch (planet) {
            case SUN:
                thePlanet = Sun.getInstance();
                break;
            case MOON:
                thePlanet = Moon.getInstance();
                break;
            case EARTH:
                thePlanet = Earth.getInstance();
                break;
            default:
                thePlanet = null;
                break;
        }
    }
}
