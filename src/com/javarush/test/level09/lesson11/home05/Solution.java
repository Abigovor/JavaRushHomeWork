package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        //Написать тут ваш код
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String s = reader.readLine();
        char[] ch = s.toCharArray();

        ArrayList<Character> list1 = new ArrayList<Character>();
        ArrayList<Character> list2 = new ArrayList<Character>();

        for(int i = 0; i < s.length(); i++)
        {
            if(isVowel(ch[i]))
            {
                list1.add(ch[i]);
            }
            else
                list2.add(ch[i]);
        }

        for(Character text : list1)
            System.out.print(text + " ");
        System.out.println();
        for(Character text : list2)
            System.out.print(text + " ");
       /* int start = 0;
        int end = s.length();
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
for(int i = 0; i < buf.length; i++)
    System.out.println(buf[i]);*/

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
