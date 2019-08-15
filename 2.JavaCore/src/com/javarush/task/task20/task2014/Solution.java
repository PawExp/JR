package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) {
        System.out.println(new Solution(4));
        Solution solution1 = new Solution(5);
        try(FileOutputStream fos = new FileOutputStream("test"); ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(solution1);
        }catch (IOException e) {
            e.printStackTrace();
        }
        try(FileInputStream fis = new FileInputStream("test"); ObjectInputStream ois = new ObjectInputStream(fis)){
            Solution solution2 = (Solution)ois.readObject();
            System.out.println(solution1.string.equals(solution2.string));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        this.string = String.format(string, sdf.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
