package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
            int[] list = new int[5];
        for (int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < list.length; i++)
            {
            int min = list[i];
            int min_i  = i;
            for (int j = i +1; j <list.length; j++)
            {
                if (list[j] < min){
                    min = list[j];
                    min_i = j;
                }
            }
            if (i !=min_i){
                int tmp = list[i];
                list[i] = list[min_i];
                list[min_i] = tmp;
            }
        }
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
