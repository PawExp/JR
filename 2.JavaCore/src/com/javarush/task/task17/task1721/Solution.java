package com.javarush.task.task17.task1721;

import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();


    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader fl1 = new BufferedReader(new FileReader(reader.readLine()))) {
            String s;
            while ((s = fl1.readLine()) != null) {
                allLines.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedReader fl2 = new BufferedReader(new FileReader(reader.readLine()))) {
            String s;
            while ((s = fl2.readLine()) != null) {
                forRemoveLines.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Solution solution = new Solution();
        try {
           solution.joinData();
        } catch (CorruptedDataException e) {
            e.getMessage();
        }
//        for (String s : allLines) {
//            System.out.println(s);
//        }


    }

    public void joinData() throws CorruptedDataException {
//        int count = 0;
//        for (int i = 0; i < forRemoveLines.size(); i++){
//            for (int j = 0; j < allLines.size(); j ++){
//                if (forRemoveLines.get(i).equals(allLines.get(j))) count++;
//            }
//        }
//        if (!(count == forRemoveLines.size())){
//            allLines.clear();
//            new CorruptedDataException("gggggggggg");
//        }else {
//
//            for (int i = 0; i < forRemoveLines.size(); i++){
//                for (int j = 0; j < allLines.size(); j ++){
//                    if (forRemoveLines.get(i).equals(allLines.get(j))) allLines.remove(j);
//                }
//            }
//        }
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
