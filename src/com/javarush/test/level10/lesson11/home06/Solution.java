package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
Human human = new Human(true, "Denis", "Melnychenko", true);
        System.out.println(human.lastName);
    }

    public static class Human
    {
        private String name;
        private String lastName;
        private  int age;
        private boolean sex;
        private boolean marrige;
        private boolean childrens;
        public Human(String name, String lastName, int age, boolean sex, boolean marrige, boolean childrens){}
        public  Human(String name, String lastName){}
        public  Human(String name, String lastName, int age){}
        public Human(String name, int age, boolean marrige){}
        public Human(String name, String lastName, boolean sex){}
        public Human(String name, String lastName, boolean sex, boolean marrige){}
        public Human(String name, String lastName, int age, boolean childrens){}
        public Human(String name, int age, boolean sex, boolean marrige){}
        public Human(int age,String name, String lastName, boolean sex){}
        public Human(boolean sex, String name, String lastName, boolean marrige){ this.lastName = lastName;}
    }
}
