package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
     String fileName;
    //public FileInputStream fis;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        //String s = fileName;
        //String[] sArr = fileName.split(".");
        if(!fileName.endsWith(".txt")){
            super.close();
            throw new UnsupportedFileNameException();
            //this.fileName = fileName;

        }else{
            this.fileName = fileName;
        }

    }

    public static void main(String[] args) {
//        String s = "ajfgn.txt";
//        System.out.println(s.length());
//        System.out.println(s.substring((s.length()-4),s.length()-1));
    }

//    @Override
//    public int read() throws IOException {
//        return fis.read();
//    }
//
//    @Override
//    public int read(byte[] b) throws IOException {
//        return fis.read(b);
//    }
//
//    @Override
//    public int read(byte[] b, int off, int len) throws IOException {
//        return fis.read(b, off, len);
//    }
//
//    @Override
//    public long skip(long n) throws IOException {
//        return fis.skip(n);
//    }
//
//    @Override
//    public int available() throws IOException {
//        return fis.available();
//    }
//
//    @Override
//    public void close() throws IOException {
//        fis.close();
//    }
//
//    @Override
//    public FileChannel getChannel() {
//        return fis.getChannel();
//    }

}

