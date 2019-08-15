package com.javarush.task.task20.task2015;

import java.io.*;
import java.util.Objects;

/* 
Переопределение сериализации
*/
public class Solution implements Serializable,Runnable {
    private transient Thread runner;
    private int speed;
   /* private int count;*/
    public Solution(int speed/*, int count*/) {
        this.speed = speed;
        /*this.count = count;*/
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        // do something here, doesn't matter what

       for(int i = this.speed; i >0; i--) {
           System.out.println(i /*+ ":" + this.count*/);
           try {
               Thread.sleep(1000);
               /* count ++;*/
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }

    /**
     Переопределяем сериализацию.
     Для этого необходимо объявить методы:
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     Теперь сериализация/десериализация пойдет по нашему сценарию :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();

        //throw new NotSerializableException("Не сегодня!");
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

            Thread thread = new Thread(this.runner);
            thread.start();

    }

    public static void main(String[] args) throws InterruptedException {
        Solution solution1 = new Solution(20/*,0*/);
        Thread.sleep(2000);
        try(
        FileOutputStream fileOutputStream = new FileOutputStream("test");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        FileInputStream fileInputStream = new FileInputStream("test");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){

            objectOutputStream.writeObject(solution1);
            Solution solution2 = (Solution)objectInputStream.readObject();
            System.out.println(solution1.equals(solution2));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Solution)) return false;
        Solution solution = (Solution) o;
        return speed == solution.speed /*&&
                count == solution.count*/;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed/*, count*/);
    }
}
