package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        for(Map.Entry<String, Date> pair : createMap().entrySet())
        {

            System.out.println(pair.getKey() + " " + pair.getValue().getMonth());

        }

        removeAllSummerPeople(createMap());



    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));

        //Напишите тут ваш код
        map.put("Сильвестр", new Date("January 1 1980"));
        map.put("Вандамм", new Date("January 1 1980"));
        map.put("Кинконг", new Date("January 3 1980"));
        map.put("Брюсли", new Date("January 1 1980"));
        map.put("Чакнорис", new Date("January 1 1980"));
        map.put("Чичолинна", new Date("January 1 1980"));
        map.put("Мордhjghем", new Date("August 1 1980"));
        map.put("Юсбих", new Date("JUNE 1 1980"));
        map.put("Модем", new Date("July 1 1980"));

        for(Map.Entry<String, Date>pair : map.entrySet())
        {
            String key = pair.getKey();
            Date value = pair.getValue();


        }

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {

            Map.Entry<String, Date> pair = iterator.next(); // получаем пары элементов

            String key = pair.getKey();
            Date value = pair.getValue();

            if(value.getMonth() > 4 && value.getMonth() < 8)
            {
                iterator.remove();
            }
        }
        System.out.println(map);
    }
}


