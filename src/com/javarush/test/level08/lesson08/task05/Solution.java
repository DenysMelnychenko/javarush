package com.javarush.test.level08.lesson08.task05;

import com.sun.corba.se.spi.activation.IIOP_CLEAR_TEXT;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createMap();

        removeTheFirstNameDuplicates((HashMap<String, String>) map);

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
    }


    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Поплавский", "Михаил");
        map.put("Пугачева", "Алла");
        map.put("Кудлай", "Алла");
        map.put("Зеленский", "Владимир");
        map.put("Путин", "Владимир");
        map.put("Мельниченко", "Денис");
        map.put("Мельниченка", "Ирина");
        map.put("Малиновская", "Анна");
        map.put("Панченко", "Сергей");
        map.put("Мороз", "Надежда");
        return (HashMap<String, String>) map;


    }


    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);
        Iterator<Map.Entry<String, String>> iterator = map2.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            map3.remove(pair.getKey());

            if (map3.containsValue(pair.getValue()))
            {
                removeItemFromMapByValue(map, pair.getValue());
            }



        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
