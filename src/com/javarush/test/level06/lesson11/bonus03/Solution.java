package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        //Напишите тут ваш код

            min();
    }

   static void min()throws IOException{
      int[] mas = new int[5];
       int min = Integer.MAX_VALUE;
       BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
       int ch;
       for(int i = 0; i < mas.length; i++)
       {
           ch = Integer.parseInt(reader.readLine());
           mas[i] = ch;
       }
       Arrays.sort(mas);
       for(int i = 0; i < mas.length; i++)
       {
           System.out.println(mas[i]);
       }
    }
}