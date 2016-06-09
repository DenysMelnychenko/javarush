package com.javarush.test.level08.lesson08.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.io.IOException;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        Set<String> set = new HashSet<String>();

        set.add("Левый");
        set.add("Левы");
        set.add("Левй");
        set.add("Леый");
        set.add("Лвый");
        set.add("Лев");
        set.add("Лый");
        set.add("Леы");
        set.add("Лейка");
        set.add("Лениыец");
        set.add("Лак");
        set.add("Лень");
        set.add("Лазня");
        set.add("Леший");
        set.add("Левочка");
        set.add("Лейтенант");
        set.add("Лейбмотив");
        set.add("Литр");
        set.add("Лесница");
        set.add("Лёша");

        return (HashSet<String>) set;
    }
}
