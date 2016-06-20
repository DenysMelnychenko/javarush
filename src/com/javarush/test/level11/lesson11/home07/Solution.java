package com.javarush.test.level11.lesson11.home07;

/* Вторая правильная «цепочка наследования»
Расставь правильно «цепочку наследования» в классах: Carnivora (плотоядное животное), Cow (корова), Dog(собака), Pig(свинья), Animal (животное).
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Carnivora extends Animal
    {
        public Carnivora() {

        }
    }

    public class Cow extends Animal
    {
        public Cow() {

        }
    }

    public class Dog extends Carnivora
    {
        public Dog() {

        }
    }

    public class Pig extends Animal
    {
        public Pig() {

        }
    }

    public class Animal
    {
        public Animal() {

        }
    }
}
