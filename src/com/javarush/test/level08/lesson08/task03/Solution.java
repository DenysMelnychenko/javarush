package com.javarush.test.level08.lesson08.task03;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        Map<String, String> maps = new HashMap<String, String>();

        maps.put("Melnichenko", "asd");
        maps.put("Ciypina", "asj");
        maps.put("wertu", "asj");
        maps.put("zagrebr", "ask");
        maps.put("zareb", "asj");
        maps.put("zarebiw", "askj");
        maps.put("zqreb", "asdf");
        maps.put("zogreb", "asjj");
        maps.put("zagreob", "assj");
        maps.put("zagreeb", "asj");

        return (HashMap<String, String>) maps;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String name1 = pair.getValue();
            if (name.equals(name1))
            {
                count++;
            }

        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (lastName.equals(pair.getKey()))
            {
                count++;
            }

        }
        return count;

    }
}
