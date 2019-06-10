package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread t1 = new T1();
        Thread t2 = new T2();
        Thread t3 = new T3();
        Thread t4 = new T4();
        Thread t5 = new T5();

        threads.add(t1);
        threads.add(t2);
        threads.add(t3);
        threads.add(t4);
        threads.add(t5);
    }

    public static void main(String[] args) throws InterruptedException {
//        threads.get(3).start();
//        Thread.sleep(2000);
//        System.out.println(threads.get(3).isAlive());
//        threads.get(3).showWarning();
//        Thread.sleep(2000);
//        System.out.println(threads.get(3).isAlive());

    }

    static class T1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    static class T2 extends Thread {
        @Override
        public void run() {
            while(true) {
                if (isInterrupted()) {
                    System.out.println("InterruptedException");
                    return;
                }
            }
        }
    }

    static class T3 extends Thread {
        @Override
        public void run() {
            while (!interrupted()) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class T4 extends Thread implements Message {
        boolean aBoolean = true;
        @Override
        public void run() {

            while (aBoolean) {
            }
        }

        @Override
        public void showWarning() {
            aBoolean = false;
        }
    }

    static class T5 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int n;
        int sum = 0;
        @Override
        public void run() {

            while (true) {
                try {
                    s = reader.readLine();
                    if (s.equals("N")) {
                        System.out.println(sum);
                        reader.close();
                        break;
                    } else {
                        n = Integer.parseInt(s);
                        sum = sum + n;
                    }
                    } catch(Exception e){
                        System.out.println("Not a number");
                }
            }
        }

    }


}