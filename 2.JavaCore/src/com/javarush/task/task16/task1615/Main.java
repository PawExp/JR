package com.javarush.task.task16.task1615;

public class Main {
    public static void main(String[] args){
        Thread thread = new Thread(){
            @Override
            public void run() {
                while(true) {
                    System.out.println("Javarush");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
        thread.interrupt();
    }
}
