package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    //Напишите тут ваши методы
    public static int min(int one, int two)
    {
        return one < two ? one : two;
    }

    public static long min(long one, long two)
    {
        return one < two ? one : two;
    }

    public static double min(double one, double two)
    {
        return one < two ? one : two;
    }
}
