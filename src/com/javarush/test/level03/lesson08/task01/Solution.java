package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!
*/

import com.sun.java_cup.internal.runtime.lr_parser;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите число: ");
        String s = reader.readLine();
        System.out.print("Введите имя: ");
        System.out.print(s + " захватит мир через " + a + " лет. Му-ха-ха!" );
    }
}