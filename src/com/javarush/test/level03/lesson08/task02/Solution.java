package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры Имя и два числа, вывести надпись:
name1 получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String name = reader.readLine();
        String chislo1 = reader.readLine();
        int schislo1 = Integer.parseInt(chislo1);
        String chislo2 = reader.readLine();
        int schislo2 = Integer.parseInt(chislo2);
        System.out.println(name + " получает " + schislo1 + " через " + schislo2 + " лет.");

    }
}