package com.javarush.task.task18.task1815;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileInputStream fileInputStream = new FileInputStream("test");

        int i;

        while((i=fileInputStream.read())!= -1){

            System.out.print((char)i);
            Thread.sleep(10);
        }
    }
}
