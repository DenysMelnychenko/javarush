package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;


/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] arrayLists = new ArrayList[2];
        ArrayList<String> list = new ArrayList<>();
        list.add("qfggg");
        ArrayList<String> list1 = new ArrayList<>();
        list.add("wgwbrrbg");

        arrayLists[0] = list;
        arrayLists[1] = list1;


        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list : arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}