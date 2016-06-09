package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> childrens = new ArrayList<Human>();
        childrens.add(new Human("Miron", true, 0, new ArrayList<Human>()));
        childrens.add(new Human("Varvara", false, 0, new ArrayList<Human>()));
        childrens.add(new Human("Danil", true, 0, new ArrayList<Human>()));

        ArrayList<Human> childrens1 = new ArrayList<Human>();
        childrens1.add(new Human("Denis", true, 26, childrens));
        childrens1.add(new Human("Irina", false, 33, childrens));





        ArrayList<Human> family = new ArrayList<Human>();
        family.add(new Human("Vasia", true, 75, childrens1));
        family.add(new Human("Petia", true, 76, childrens1));
        family.add(new Human("Nadia", false, 61, childrens1));
        family.add(new Human("Anna", false, 61, childrens1));
        family.addAll(4, childrens);
        family.addAll(7,childrens1);

        for (Human human : family)
        {
            System.out.println(human);
        }
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
