package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {

        //Написать тут ваш код
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat("Cat"));
        result.add(new Cat("Cat1"));
        result.add(new Cat("Cat2"));
        result.add(new Cat("Cat3"));

        return result;
    }

    public static Set<Dog> createDogs()
    {
        //Написать тут ваш код
        HashSet<Dog> result = new HashSet<Dog>();

        Dog dog = new Dog("Dog");
        Dog dog1 = new Dog("Dog1");
        Dog dog2 = new Dog("Dog2");

        result.add(dog);
        result.add(dog1);
        result.add(dog2);


        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        //Написать тут ваш код
        HashSet<Object> obj = new HashSet<Object>();
        obj.addAll(cats);
        obj.addAll(dogs);
        return obj;
    }


    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        //Написать тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets)
    {
        //Написать тут ваш код
        for(Object text : pets)
        {
            System.out.println(text.toString());
        }
    }

    //Написать тут ваш код
    public static class Cat
    {
        String name;

        public void getName(String name)
        {
            this.name = name;
        }

        public Cat(String name)
        {
            this.name = name;
        }
    }

    public static class Dog
    {
        String name;

        public Dog(String name)
        {
            this.name = name;
        }
    }
}
