package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        int[] list = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       for (int i = 0; i < list.length; i++){
           list[i] = Integer.parseInt(reader.readLine());

       }

        int minimum = min(list);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int[] list)
    {
         int m = list[0];
        for (int i = 0; i < list.length; i++){
            if(list[i] < m) m = list[i];
            }
        return m;
        }
    }