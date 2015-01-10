package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean sex;
        private String adress;
        private String number;
        private String pets;

        public Human()
        {
        }

        public Human(String name)
        {
            this.name = name;
        }

        public Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, String adress)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.adress = adress;
        }

        public Human(String name, int age, boolean sex, String adress, String number)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.adress = adress;
            this.number = number;
        }

        public Human(String name, int age, boolean sex, String adress, String number, String pets)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.adress = adress;
            this.number = number;
            this.pets = pets;
        }

        public Human(String name, int age, String adress, String number)
        {
            this.name = name;
            this.age = age;
            this.adress = adress;
            this.number = number;
        }

        public Human(String name, int age, String adress, String number, String pets)
        {
            this.name = name;
            this.age = age;
            this.adress = adress;
            this.number = number;
            this.pets = pets;
        }

        public Human(String name, String adress, String pets)
        {
            this.name = name;
            this.adress = adress;
            this.pets = pets;
        }


        public Human(String name, boolean sex, String pets)
        {
            this.name = name;
            this.sex = sex;
            this.pets = pets;
        }
    }
}
