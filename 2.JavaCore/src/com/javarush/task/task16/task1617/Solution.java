package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
        //System.out.print("Прервано");
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            Thread count = Thread.currentThread();
            if (numSeconds <=3) {
                while (!count.isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
//                        e.printStackTrace();
                    }
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    if (numSeconds == 0) {
                        System.out.println("Марш!");
                        count.interrupt();
                    }
                }
            }else if (numSeconds > 3){
                while (!count.isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
//                        e.printStackTrace();
                    }
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    if (numSeconds == 0) {
                        System.out.println("Прервано!");
                        count.interrupt();
                    }
                }
            }
        }
    }
}
