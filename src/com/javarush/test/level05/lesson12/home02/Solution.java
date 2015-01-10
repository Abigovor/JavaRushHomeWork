package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man = new Man("Man", 27, "Dolon 12");
        Man man1 = new Man("Man", 37, "Dolo 12");
        Woman woman = new Woman("Anna", 17, "Dolon 2");
        Woman woman1 = new Woman("Katya", 36, "Dolona 12");

        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
    }

    public static class Man
    {
       String name;
        int age;
        String address;

        public Man(String name)
        {
            this.name = name;
        }

        public Man(int age)
        {
            this.age = age;
        }

        public Man(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Man(String name, String address)
        {
            this.name = name;
            this.address = address;
        }

        public Man(int age, String address)
        {
            this.age = age;
            this.address = address;
        }

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman
    {
        String name;
        int age;
        String address;

        public Woman(String name)
        {
            this.name = name;
        }

        public Woman(int age)
        {
            this.age = age;
        }

        public Woman(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, String address)
        {
            this.name = name;
            this.address = address;
        }

        public Woman(int age, String address)
        {
            this.age = age;
            this.address = address;
        }

        public Woman(String name, int age, String adress)
        {
            this.name = name;
            this.age = age;
            this.address = adress;
        }
    }

}
