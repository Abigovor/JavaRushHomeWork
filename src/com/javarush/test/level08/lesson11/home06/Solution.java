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
        //Написать тут ваш код
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(new Human("Дочь",false,17));
        children.add(new Human("Сын",true,19));
        children.add(new Human("Сын2",true,19));


        for(Human test : children)
            System.out.println(test);

        ArrayList<Human> father = new  ArrayList<Human>();
        father.add(new Human("fther",true,35,children));
        ArrayList<Human> mothers = new ArrayList<Human>();
        mothers.add(new Human("mothers",false,35,children));

        for(Human test : father)
            System.out.println(test);

        for(Human test : mothers)
            System.out.println(test);

        System.out.println(new Human("Дед1",true,74,father));
        System.out.println(new Human("Дед2",true,74,mothers));
        System.out.println(new Human("Баба1",false,72,mothers));
        System.out.println(new Human("Баба2",false,72,father));



    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human()
        {

        }

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            children = new ArrayList<Human>();
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
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
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
