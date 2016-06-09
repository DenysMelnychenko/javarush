package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
       ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0, 4);
        list.add(1, 6);
        list.add(2, 7);
        list.add(3, 8);
        list.add(4, 9);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++){
            int j = list.size() - i -1;
            System.out.println(list.get(j));
        }

        //напишите тут ваш код

    }
}
