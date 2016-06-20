package com.javarush.test.level11.lesson11.home10;

/* Пятая правильная «цепочка наследования»
Расставь правильно «цепочку наследования» в классах: House (дом), Cat (кот), Dog(собака), Car (машина), Animal(животное), Assets (имущество).
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class House extends Assets
    {
        House() {

        }
    }

    public class Cat extends Animal
    {
        Cat() {

        }
    }

    public class Car extends Assets
    {
        Car() {

        }
    }

    public class Dog extends Animal
    {
        Dog() {

        }
    }

    public class Animal
    {
        Animal() {

        }
    }

    public class Assets
    {
    Assets() {

    }
    }
}
