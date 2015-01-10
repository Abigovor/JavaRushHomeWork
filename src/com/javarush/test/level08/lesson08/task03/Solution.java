package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/



public class Solution
{
    public static  void main (String[] args)
    {

        int a = Solution.getCountTheSameFirstName(createMap(), "Дмитрий");
        System.out.println(a);
        int b = Solution.getCountTheSameLastName(createMap(), "Бондарев");
        System.out.println(b);
    }
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();

        map.put("Бондарев", "Александр");
        map.put("Петренко", "Владимир");
        map.put("Голованевский", "Максим");
        map.put("Сорокин", "Александр");
        map.put("Легкодым", "Дмитрий");
        map.put("Яровой", "Андрей");
        map.put("Шеремет", "Александр");
        map.put("Сколоцкий", "Анатолий");
        map.put("Янков", "Дмитрий");
        map.put("Киксель", "Руслан");


       //return (HashMap) map;
        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int a = 0;
        while(iterator.hasNext()) // проверка, есть ли еще элементы
        {
            Map.Entry<String, String> pair = iterator.next(); // получение <<пары>> элементов
            String value = pair.getValue();
            if(name.equals(value))
            {
                a++;
            }
        }
        return a;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator(); // получение пары элементов
        int z = 0;
        while(iterator.hasNext())  // проверка, есть ли еще элементы
        {
            Map.Entry<String, String> pair = iterator.next(); // получение <<пары>> элементов
            String key = pair.getKey();

            if(familiya.equals(key))
            {
                z++;
            }
        }
    return z;
    }
}
