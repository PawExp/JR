package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
//    static {
//        properties.put("1","one");
//        properties.put("2","two");
//        properties.put("3","three");
//    }

    public void fillInPropertiesMap() throws Exception {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fis = new FileInputStream(fileName);
        //FileOutputStream fos = new FileOutputStream(fileName);

        load(fis);

    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties propertiesSave = new Properties();
        propertiesSave.putAll(properties);
        propertiesSave.store(outputStream,"prop");
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties propertiesLoad = new Properties();
        propertiesLoad.load(inputStream);
        properties = new HashMap(propertiesLoad);
    }

    public static void main(String[] args) throws Exception {
//        FileOutputStream fileOutputStream = new FileOutputStream("test.properties");
//        Solution.save(fileOutputStream);
//        for(Map.Entry map: properties.entrySet()) {
//            String key = (String) map.getKey();
//            String value = (String) map.getValue();
//
//            System.out.println(key + "=" + value);
//        }
//
//        Solution solution = new Solution();
//        solution.fillInPropertiesMap();
//        System.out.println("===============");
//        for(Map.Entry map: properties.entrySet()) {
//            String key = (String) map.getKey();
//            String value = (String) map.getValue();
//
//            System.out.println(key + "=" + value);
//        }

    }
}
