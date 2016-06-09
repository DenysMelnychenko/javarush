package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new  InputStreamReader(System.in));
        String a = reader.readLine();
        String a1 = reader.readLine();
        String a2 = reader.readLine();

        int m = Integer.parseInt(a);
        int m1 = Integer.parseInt(a1);
        int m2 = Integer.parseInt(a2);

        if (m < m1 && m < m2 && m1 < m2)
            System.out.println(m1);
        else if (m < m1 && m < m2 && m1 > m2)
            System.out.println(m2);
        else if (m1 < m && m1 < m2 && m < m2)
            System.out.println(m);
        else if (m1 < m && m1 < m2 && m > m2)
            System.out.println(m2);
        else if (m2 < m && m2 < m1 && m < m1)
            System.out.println(m);
        else if (m2 < m && m2 < m2 && m > m1)
            System.out.println(m1);


        //напишите тут ваш код
    }
}
