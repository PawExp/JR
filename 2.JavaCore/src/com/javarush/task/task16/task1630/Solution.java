package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static{
        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
//        systemOutPrintln("test");
//        systemOutPrintln("test1");

//        String s = "";
//        try (BufferedReader br = new BufferedReader(new FileReader("test"))) {
//            String line;
//            while((line = br.readLine()) != null){
//                //обрабатываем считанную строку - пишем ее в консоль
//                s = s + line;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(s);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface extends Runnable {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String fileName = "";
        String fileContent = "";
        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return fileContent;
        }

//        @Override
//        public void start() {
//
//        }

        @Override
        public void run() {
            //getFileContent();
            fileContent = "";
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while((line = br.readLine()) != null){
                    //обрабатываем считанную строку - пишем ее в консоль
                    fileContent = fileContent + line + " ";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

           //System.out.println(fileContent);

        }
    }
    //
}
