package com.javarush.test.level02.lesson08.task03;

/* Минимум трех чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
*/
public class Solution
{
    public static void main(String[] args)
    {
        int a = 2, b = 3, c = 1;
        //123
        //321
        //213
        //231 - 2
        int m = min(a, b, c);
        System.out.println("Minimum is " + m);
    }
    public static int min(int a, int b, int c)
    {
        int m2;

        if (a < b && b < c || a < b && b > c && a < c)
        {
            m2 = a;
        }
        else if (a > b && b < c )
            {
                m2 = b;
            }
            else
            {
                m2 = c;
            }
        return m2;
    }
}