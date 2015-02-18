package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Pair<String, String>> list = new ArrayList<>();


        char[] oneBuf = null;
        String str = reader.readLine();
        char arr[] = str.toCharArray();
        int start = 0;
        int finish = 0;


        String strURL = reader.readLine();
        URL url = new URL(strURL);
        String[] params = url.getQuery().split("&");
        for (String text : params)
            System.out.println(text);


        // Цикл для перебора ссылки и копирование в новую строку все после "?"
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] == '?')
            {
                start = i + 1;
                finish = arr.length;
                // массив той самой длины
                oneBuf = new char[finish - start];
                // получаем буквы и записыаем их в oneBuf
                str.getChars(start, finish, oneBuf, 0);
            }

        }
        // получаем массив строк, разделенные &
        String[] rezerv = new String(oneBuf).split("&");
        // перебераем массив строк
        for (String text : rezerv)
        {
            if (!text.contains("="))
                list.add(new Pair(text, text));
            // массив строк для записи значений "до и после ="
            String[] rezerv2 = text.split("=");
            for (int i = 0; i < rezerv2.length - 1; i++)
            {
                list.add(new Pair(rezerv2[i], rezerv2[++i]));
            }
        }

        for (Pair<String, String> pair : list)
        {
            System.out.print(pair.key + " ");
        }

        System.out.println();


        for (Pair<String, String> pair : list)
            try
            {
                if(pair.key.equals("obj"))
                    alert(Double.parseDouble(pair.value));
            }
            catch (NumberFormatException e)
            {
                alert(pair.key);
            }
    }

    public static void alert(double value)
    {
        System.out.println("double " + value);
    }

    public static void alert(String value)
    {
        System.out.println("String " + value);
    }

    private static class Pair<T, V>
    {
        T key;
        V value;

        Pair(T key, V value)
        {
            this.key = key;
            this.value = value;
        }

        public T getKey()
        {
            return key;
        }

        public V getValue()
        {
            return value;
        }
    }
}
