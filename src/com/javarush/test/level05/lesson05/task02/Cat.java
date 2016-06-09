package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {


    }

    public  boolean fight(Cat anotherCat)
    {
        int shans1 = weight * age * strength;

        int shans2 = anotherCat.weight * anotherCat.age * anotherCat.strength;
        if (shans1 > shans2)

        return true;
        else
            return false;
    }




}
