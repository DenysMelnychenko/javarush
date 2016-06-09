package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;
/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

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
        return a.compareTo(b) > 0;
    }
}
