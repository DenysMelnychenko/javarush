package com.javarush.test.level09.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.*;
;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();
        /*try*/
        /*{*/
            FileInputStream fileInputStream = new FileInputStream(sourceFileName);
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

            int count = 0;
            while (fileInputStream.read()>0)
            {
                int data = fileInputStream.available();
                fileOutputStream.write(data);
                count++;
            }

            System.out.println("Скопировано байт " + count);

            fileInputStream.close();
            fileOutputStream.close();
        /*}*/
        /*catch (IOException io){
            System.out.println(io);
        }*/
        }

}
