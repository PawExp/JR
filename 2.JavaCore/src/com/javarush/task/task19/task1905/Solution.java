package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
//        String ss = "Ivanov, Ivan";
//        String[] aa = ss.split(", ");
//        System.out.println(aa[1]);

//        String num = "+3(805)0123-4567";
//        String dialString = "+";
//        for (int i = 0; i < num.length(); i++){
//            if(num.charAt(i) > 47 && num.charAt(i) < 58)
//                dialString = dialString + num.charAt(i);
//        }
//        System.out.println(dialString);
    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String countryCode = "";
            for(Map.Entry<String,String> map: countries.entrySet()){
                String key = map.getKey();
                String value = map.getValue();
                if(customer.getCountryName().equals(value))countryCode = key;
            }
            return countryCode;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] arr = contact.getName().split(", ");
            return arr[1];
        }

        @Override
        public String getContactLastName() {
            String[] arr = contact.getName().split(", ");
            return arr[0];

        }

        @Override
        public String getDialString() {
            String contactPhone = contact.getPhoneNumber();
            String dialString = "callto://+";
            for (int i = 0; i < contactPhone.length(); i++){
                if(contactPhone.charAt(i) > 47 && contactPhone.charAt(i) < 58)
                    dialString = dialString + contactPhone.charAt(i);
            }
            return dialString;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA
        String getCompany();            //For example: JavaRush Ltd.
        String getContactFirstName();   //For example: Ivan
        String getContactLastName();    //For example: Ivanov
        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.
        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan
        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}