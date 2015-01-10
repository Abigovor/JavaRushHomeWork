package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static long mul(int a, int b) {
        long g = (long)(a * b);
        return g;
    }

    public static void main(String... args) {
        System.out.println(mul(2, 2));
    }

    }

