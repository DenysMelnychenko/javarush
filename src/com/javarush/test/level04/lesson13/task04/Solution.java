package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String s = "8";
        int x, y;

        for (x = 1; x <= 9; x++)
        {
            System.out.print(s);
        }
        for (y = 1; y <= 9; y++)
        {
            System.out.println(s);
        }

    }
}
