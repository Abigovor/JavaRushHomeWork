package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader((System.in)));
        int one = Integer.parseInt(reader.readLine());
        int two = Integer.parseInt(reader.readLine());
        if (one > two)
        {
            System.out.println(two);
        }
        else
        {
            System.out.println(one);
        }
    }
}