package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int one = Integer.parseInt(reader.readLine());
        int two = Integer.parseInt(reader.readLine());
        int three = Integer.parseInt(reader.readLine());
        min(one,two,three);
    }

    public static void min(int a, int b, int c)
    {
        if (a < b && b < c)
            System.out.printf("%d %d %d", c, b, a);
        else if (a > b && b > c)
            System.out.printf("%d %d %d", a, b, c);
        else if (a > b && b < c && a > c)
            System.out.printf("%d %d %d", a, c, b);
        else if (a > b && b < c && a < c)
            System.out.printf("%d %d %d", c, a, b);
        else if (a < b && b >c && c > a)
            System.out.printf("%d %d %d", b, c, a);
        else if (a < b && b >c && a > c)
            System.out.printf("%d %d %d", b, a, c);
    }
}
