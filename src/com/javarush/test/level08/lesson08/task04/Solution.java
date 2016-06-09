package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Melnichenko", new Date("OCTOBER 1 1980"));
        map.put("Ciypina", new Date("OCTOBER 1 1980"));
        map.put("wertu", new Date("OCTOBER 1 1980"));
        map.put("zagrebr", new Date("OCTOBER 1 1980"));
        map.put("zareb",new Date("JULY 20 1980"));
        map.put("zarebiw",new Date("OCTOBER 1 1980"));
        map.put("zqreb",new Date("FEBRUARY 28 1980"));
        map.put("zogreb",new Date("OCTOBER 1 1980"));
        map.put("zagreob",new Date("AUGUST 1 1980"));



        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> pair = map.entrySet().iterator();
        while (pair.hasNext())
        {
            Date n = pair.next().getValue();
            if (n.getMonth() >4 && n.getMonth()< 8){
            pair.remove();
            }
        }
    }
}
