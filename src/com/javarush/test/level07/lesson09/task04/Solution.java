package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list.add("она"); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //add your code here -  добавь код тут

        ArrayList<String> lst = new ArrayList<String>();
        Iterator<String> iterator = list.iterator(); // Получение итеретора для списка

        while (iterator.hasNext())  // проверка, есть ли еще элементы
        {
            String s = iterator.next();
            if (s.contains("р") && s.contains("л"))
            {
                lst.add(s);
            }
            else if(!s.contains("р") && !s.contains("л"))
            {
                lst.add(s);
            }

            if(s.contains("р"))
            {
                iterator.remove();
            }else if (s.contains("л"))
            {
                lst.add(s);
                lst.add(s);
            }
        }


        return lst;
    }
}