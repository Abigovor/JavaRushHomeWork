package com.javarush.test.level14.lesson08.bonus01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        try
        {
            String s = "sad";
            int i = Integer.parseInt(s);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int[] mas = null;
            for (int i = 0; i < 3; i++)
                mas[i] = 2;
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int[] mas = new int[2];
            for (int i = 0; i <= 3; i++)
                mas[i] = i;
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int[] mas = new int[-5];
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            Object[] mas = new String[5];
            mas[1] = 12;
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            Object ob = new Character('*');
            System.out.println((byte) ob);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            String str = "qwer";
            str.charAt(10);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            InputStream in = new FileInputStream("asd");
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            OutputStream out = new FileOutputStream("asd");
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

    }
}
