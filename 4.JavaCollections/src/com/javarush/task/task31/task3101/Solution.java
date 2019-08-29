package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.*;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        File path = new File(args[0]);
        File fileToRen = new File(args[1]);
        File newRenameFile = new File(fileToRen.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(fileToRen, newRenameFile);

        HashSet<String> hashSet = new HashSet<>();
        ArrayList<File> files = new ArrayList<>();

        for (File file : path.listFiles()) {
            rec(file, hashSet, files);
        }
        ArrayList<String> fileName = new ArrayList<>(hashSet);
        Collections.sort(fileName);
        FileOutputStream fos = new FileOutputStream(newRenameFile,true);
        for (String s : fileName) {
            for (File f : files) {
                if (s.equals(f.getName())) {
                    try (FileInputStream fis = new FileInputStream(f)) {
                        byte[] buf = new byte[100];
                        while (fis.available() > 0) {
                            int count = fis.read(buf);
                            fos.write(buf, 0, count);
                        }
                        fos.write(10);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        fos.close();
    }

    public static void rec(File file, HashSet<String> set, ArrayList<File> af) {
        if (file.isDirectory()) {
            for (File file1 : file.listFiles())
                rec(file1, set, af);
        }
        if (file.isFile() && file.getName().endsWith(".txt") && (file.length() <= 50)) {
            set.add(file.getName());
            af.add(file);
        }
    }
}
