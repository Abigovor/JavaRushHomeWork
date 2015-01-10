package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        Human grandFather1 = new Human("дед1", false, 55);
        Human grandFather2 = new Human("дед2", false, 56);

        Human grandMother = new Human("бабуш1", true, 45);
        Human grandMother2 = new Human("бабуш2", true, 70);

        Human father2 = new Human("Дмитрий", false, 23 , grandFather1, grandMother);
        Human mother2 = new Human("Аня", true, 19, grandFather2, grandMother2);

        Human douther = new Human("Алиса", true, 20, father2, mother2);
        Human douther2 = new Human("Алиса", true, 21, father2, mother2);
        Human son = new Human("Аркадий", false, 25, father2, mother2);

        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother);
        System.out.println(grandMother2);
        System.out.println(father2);
        System.out.println(mother2);
        System.out.println(douther);
        System.out.println(douther2);
        System.out.println(son);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name)
        {
            this.name = name;
        }

        Human(String name, boolean sex,int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
