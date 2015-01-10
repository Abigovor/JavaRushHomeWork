package com.javarush.test.level02.lesson08.task05;

/* Дублирование строки
Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Solution
{
    public static void main(String[] args)throws IOException
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
            System.out.println(s);
        }
    }
}