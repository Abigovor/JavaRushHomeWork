package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int one = Integer.parseInt(reader.readLine());
        int two = Integer.parseInt(reader.readLine());
        int three = Integer.parseInt(reader.readLine());
        if (one < two && two < three)
            System.out.print(two);
        else if (one > two && two > three)
            System.out.print(two);
        else if (one < two && two > three && three > one)
            System.out.print(three);
        else if (one < two && two > three && two > one)
            System.out.print(one);
        else if ( one > two && two < three && one > three)
            System.out.print(three);
        else if ( one > two && two < three && one < three)
            System.out.print(one);
    }
}
