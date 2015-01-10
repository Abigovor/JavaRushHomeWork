package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        boolean exit = false;
        int sum = 0;
        int i;

        while (!exit)
        {
            String s = reader.readLine();
            i = Integer.parseInt(s);
            sum = i + sum;
            if (s.equals("-1"))
            {
                System.out.print(sum);
                break;
            }
        }
    }
}
/* таблица умножения с помошью while*/