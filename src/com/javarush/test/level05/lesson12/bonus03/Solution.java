package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String N = reader.readLine();
        int n = Integer.parseInt(N);
        int[] list = new int[n];
        if (n < 0){
            System.out.println("Введите положительное число");
        } else{
            for (int i = 0; i < n; i++)
            {
                list[i]= Integer.parseInt(reader.readLine());
            }
        }

        int maximum = list[0];
        for (int i = 1; i < list.length; i++){
            if (list[i] > maximum)
                maximum = list[i];

        }

        //напишите тут ваш код




        System.out.println(maximum);
    }
}
