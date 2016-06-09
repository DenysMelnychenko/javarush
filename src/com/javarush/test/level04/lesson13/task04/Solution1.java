package com.javarush.test.level04.lesson13.task04;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution1
{
    public static void main(String[] args) throws Exception
    {


        for (int x = 0; x < 11; x++)
        {
            for (int y = 0; y < 10; y++)
            {
                if (x==0 || y==0)
                System.out.print("8");
            }
            System.out.println();
        }



    }
}
