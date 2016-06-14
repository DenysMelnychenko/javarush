package com.javarush.test.level11.lesson06.task05;

/* ИТ-компания
Написать девять классов: Worker(сотрудник), Clerk (клерк), IT (ИТ-специалист), Programmer(программист), ProjectManager(менеджер проекта), CTO(технический директор), HR(рекрутер), OfficeManager(офис-менеджер), Cleaner (уборщик).
Унаследовать программиста, менеджера проекта и технического директора от ИТ-специалиста.
Унаследовать рекрутера, уборщика и офис-менеджера от клерка.
Унаследовать клерка и ИТ-специалиста от сотрудника.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Worker
    {
        public Worker() {

        }
    }

    public class Clerk extends Worker
    {
        public Clerk() {

        }
    }

    public class IT extends Worker
    {
        public IT() {

        }
    }

    public class Programmer extends IT
    {
        public Programmer() {

        }
    }

    public class ProjectManager extends IT
    {
        public ProjectManager() {

        }
    }

    public class CTO extends IT
    {
        public CTO() {

        }
    }

    public class OfficeManager extends Clerk
    {
        public OfficeManager() {

        }
    }

    public class HR extends Clerk
    {
        public HR() {

        }
    }

    public class Cleaner extends Clerk
    {
        public Cleaner() {

        }
    }
}
