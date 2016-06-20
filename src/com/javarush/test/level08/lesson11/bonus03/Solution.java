package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.*;
=======

>>>>>>> javarush/master
/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

<<<<<<< HEAD
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length - 1; i++) {
=======
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
>>>>>>> javarush/master
            array[i] = reader.readLine();
        }

        sort(array);

<<<<<<< HEAD
        for (String x : array) {
=======
        for (String x : array)
        {
>>>>>>> javarush/master
            System.out.println(x);
        }
    }

<<<<<<< HEAD
    public static void sort(String[] array) {

        /*ArrayList<String> sorted = new ArrayList<String>(20);
        for (int i = 0; i < array.length - 1; i++) {
            sorted.set(i, array[i]);
           }
        Collections.sort(sorted);*/

        String[] sorted = new String[20];
            for (int i = 0; i < array.length - 2; i++) {
                for (int j = 1; j <= array.length-1; j++
                        ) {
                    for (int k = 0; k < sorted.length-1; k++) {


                        if (isGreaterThan(array[i], array[j])) {
                            sorted[k] = array[j];
                        }
                        else {
                            sorted[k] = array[i];
                        }
                    }

                }

        }


    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
=======
    public static void sort(String[] array)
    {
        int n = array.length;
        String temp;
        for (int i = 0; i < n; i++)

        {

            for (int j = i + 1; j < n; j++)

            {

                if (isGreaterThan(array[i], array[j]))

                {

                    temp = array[i];

                    array[i] = array[j];

                    array[j] = temp;

                }

            }

        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
>>>>>>> javarush/master
        return a.compareTo(b) > 0;
    }
}
