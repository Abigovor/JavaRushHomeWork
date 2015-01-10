package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception, IOException
    {
        int two = 0, three = 0;
        BufferedReader reader = new BufferedReader(
               new InputStreamReader(System.in));
        String s;
        boolean exit = false;
        int sum = 0;
        while (!exit)
        {
            two = two + sum;
           s = reader.readLine();
            if(exit = s.equals("сумма"))
            {
                System.out.print(two);
                break;
            }
            sum = Integer.parseInt(s);
        }
    }
}
