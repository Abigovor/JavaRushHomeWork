package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(reader.readLine());
        int two = Integer.parseInt(reader.readLine());

        int tmp = 0;
        if (one < two)
        {
            for (int i = 1; i <= two; i++)
                if ((one % i) == 0 && (two % i) == 0)
                {
                    tmp = i;
                    if (i > tmp)
                        tmp = i;
                }
        } else if (one > two)
        {
            for (int j = 1; j <= one; j++)
                if ((one % j) == 0 && (two % j) == 0)
                {
                    tmp = j;
                    if (j > tmp)
                        tmp = j;
                }
        }
        System.out.println(tmp);

        // nod вывод на экран
        System.out.println(nod(one, two));
    }

    // Рекурсивное решение
    public static int nod(int a, int b)
    {
        if (b == 0)
        {
            return a;
        } else
            return nod(b, a % b);
    }

}
