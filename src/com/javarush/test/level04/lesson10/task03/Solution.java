package com.javarush.test.level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 1;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
       // System.out.print("Введите строку: ");
        String str = reader.readLine();
        //System.out.print("Введите сколько раз будет повторятся строа: ");
        int povtor = Integer.parseInt(reader.readLine());
        while (povtor >= i )
        {
            System.out.println(str);
            i++;
        }


    }
}
