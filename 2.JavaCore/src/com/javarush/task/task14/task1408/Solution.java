package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.UKRAINE);
        hen.getCountOfEggsPerMonth();

//        Hen hen1 = HenFactory.getHen(Country.RUSSIA);
//        hen1.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            if (Country.RUSSIA.equals(country)){
                hen = new RussianHen();
                //return hen;
            }else if (country.equals(Country.BELARUS)){
                hen = new BelarusianHen();
                //return hen;
            }else if (country.equals(Country.MOLDOVA)){
                hen = new MoldovanHen();
               // return hen;
            }else {
                hen = new UkrainianHen();
                //return hen;
            }
            return hen;
        }
    }
}
