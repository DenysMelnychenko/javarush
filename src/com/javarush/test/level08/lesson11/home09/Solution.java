package com.javarush.test.level08.lesson11.home09;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws ParseException
    {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d yyyy");

        System.out.println(sdf.format(date));
        System.out.println(isDateOdd(sdf.format(date)));
    }

    public static boolean isDateOdd(String date) throws ParseException
    {
        Date date1 = new Date();
        date1.setMonth(0);
        date1.setDate(0);

        Date curent = new Date(date);

        int msInDay = 1000 * 60 * 60 * 24;
        long diff = (date1.getTime() - curent.getTime()) / msInDay;
        return ((diff % 2) == 0);

    }
}
