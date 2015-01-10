package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //Напишите тут ваш код
//        String s = "qwerttyuuiiiipipi";
//        ArrayList<String> arraylist1 = new ArrayList<String>();
//        arraylist1.add(s);
//        ArrayList<String> arraylist2 = new ArrayList<String>();
//        arraylist2.add(s);

        ArrayList<String>[] lists = new ArrayList[2];
        for(int i = 0; i < lists.length; i++)
        {
            ArrayList<String> list = new ArrayList<String>();
            list.add("Привет");
            lists[i] = list;
        }

        return lists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}