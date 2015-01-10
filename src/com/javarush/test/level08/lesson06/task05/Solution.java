package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List  getListForGet()
    {
        //Напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < list.size(); i ++)
        list.get(i);

        return list;
    }

    public static List  getListForSet()
    {
        //Напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < list.size(); i ++)
            list.set(i, "s");

        return list;
    }

    public static List  getListForAddOrInsert()
    {
        //Напишите тут ваш код
        LinkedList<String> list = new LinkedList<String>();
        for(int i = 0; i < list.size(); i ++)
            list.add("g");

        return list;

    }

    public static List  getListForRemove()
    {
        //Напишите тут ваш код
        LinkedList<String> list = new LinkedList<String>();
        for(int i = 0; i < list.size(); i ++)
            list.remove(i);

        return list;

    }
}
