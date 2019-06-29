package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt" ;
    public FileOutputStream fos;

    public AmigoOutputStream(FileOutputStream f) throws FileNotFoundException {
        super(fileName);
        this.fos = f;
    }


    public static void main(String[] args) throws IOException {
      new AmigoOutputStream(new FileOutputStream(fileName));

    }

    @Override
    public void write(int b) throws IOException {
        fos.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        fos.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        fos.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        fos.flush();
    }

    @Override
    public void close() throws IOException {
        fos.flush();
        String s = "JavaRush © All rights reserved.";
        byte[] g = s.getBytes();
        fos.write(g);
        fos.close();
    }
}
