package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    //Напишите тут ваши методы
    public static int max(int one, int two)
    {
        return one > two ? one : two;
    }

    public static long max(long one, long two)
    {
        return one > two ? one : two;
    }

    public static double max(double one, double two)
    {
        return one > two ? one : two;
    }
}
