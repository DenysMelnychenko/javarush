package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();

        int m = Integer.parseInt(a);
        int n = Integer.parseInt(b);

        String s = "8";
            int x, y;

        for (x = 1; x <= m; x++ )
        {
            for (y = 1; y <= n; y++)
            {
                System.out.print(s);
            }
            System.out.println(" ");
        }

        //напишите тут ваш код

    }
}
