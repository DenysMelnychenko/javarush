package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        String str = "";
        OutputStream fileOutputStream = new FileOutputStream(name);
        while (!str.equals("exit")) {
            str = reader.readLine();
            String res = str + "\r\n";
            byte[] outputinfo = res.getBytes();
            for (byte i : outputinfo) {
                fileOutputStream.write(i);
            }

        }
        reader.close();
        fileOutputStream.close();

    }


}
