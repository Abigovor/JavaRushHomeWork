package com.javarush.test.level08.lesson08.task02;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main (String[] args) throws IOException
    {
        removeAllNumbersMoreThen10(createSet());
    }

    public static HashSet<Integer> createSet()
    {
        //Напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < 20; i++)
        {
            set.add(25-i);
        }

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThen10(HashSet<Integer> set)
    {
        //Напишите тут ваш код
    Iterator<Integer> iterator = set.iterator(); // получения итератора для множества

        while(iterator.hasNext()) // проверка есть ли еще элеменыты
        {
            int i = iterator.next(); // получение текущего элемента и переход на следующий элемент
            if(i > 10)
            {
                iterator.remove();
                System.out.println(i);
            }
        }
        return set;
    }
}

