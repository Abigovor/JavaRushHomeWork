package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] chars = s.toCharArray();
        //Напишите тут ваш код

        for (int i = 0; i < chars.length - 1; i++)
        {
            if(i == 0)
                chars[i] = Character.toUpperCase(chars[i]);
            if (chars[i] == ' ')
                chars[i+1] = Character.toUpperCase(chars[i+1]);

        }
        System.out.println(chars);
    }
}
