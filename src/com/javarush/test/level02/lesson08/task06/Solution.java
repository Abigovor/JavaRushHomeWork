package com.javarush.test.level02.lesson08.task06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* Вывод текста на экран
Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
Слова должны быть разделены пробелом и не должны сливаться в одно.
*/
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String s = reader.readLine();
        print3(s);
    }

    public static void print3(String s)
    {
        for(int i = 0; i < 3; i++)
        {
            System.out.print(s + " ");
        }
    }
}