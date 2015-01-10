package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Букин", "Виктор");
        map.put("Мальцов", "Андрей");
        map.put("Аносов", "Петр");
        map.put("Малышев", "Виктор");
        map.put("Зимин", "Саня");
        map.put("Головие", "Виктор");
        map.put("Жопов", "Игнат");
        map.put("Корявый", "Витек");
        map.put("Акакий", "Саня");
        map.put("Мосин", "Виктор");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
//Создадим сначала временный лист, куда запишем повторы
        ArrayList<String> list = new ArrayList<String>();

        for (Map.Entry<String, String> pair : map.entrySet())
        {//берём каждый элемент
            int count = 0; //устанавливаем в начале цикла счётчик 0
            //и сравниваем с каждым следующим элементом, начиная с текущего
            for (Map.Entry<String, String> pair2 : map.entrySet())
            {
                if(pair.getValue().equals(pair2.getValue()))
                {
                    //если есть совпадения (а они есть всегда)
                    //то счётчик +1
                    count++;
                }
            }
            //если в цикле каждого значения счётчик получился больше
            //чем 1, то значит в строках есть повторение (одинаковые имена)
            if (count > 1) {
                //значит повтор пишем во временный лист
                list.add(pair.getValue());
            }
        }
        //после окончания всех сверок, вызываем метод удаления
        //куда передаём имеющуюся карту и что нужно найти и удалить
        for(int i = 0; i < list.size(); i++)
        {
            removeItemFromMapByValue(map,list.get(i));
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
