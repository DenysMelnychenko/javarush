package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
   private String FriendName = null;
       public void initialize(String name)
    {
        this.FriendName = name;
    }

    public void initialize(String name, String age)
    {
        this.FriendName = name + age;
    }

    public void initialize(String name, String age, String gender)
    {
        this.FriendName = name + age + gender;
    }

    //напишите тут ваш код
}
