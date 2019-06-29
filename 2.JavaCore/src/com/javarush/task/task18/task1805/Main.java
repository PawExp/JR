package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("d:/1 пупсь/1 Эксперт/почерк/спб/библиотека/aprp-2-2011-22455.pdf");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("test1");

        byte[] buffer = new byte[1000];
        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            // прочитать очередной блок байт в переменную buffer и реальное количество в count
            int count = inputStream.read(buffer);
            System.out.println(count);
            outputStream.write(buffer, 0, count); //записать блок(часть блока) во второй поток
        }

        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        outputStream.close();
    }

}
