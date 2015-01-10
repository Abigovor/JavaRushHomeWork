package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        String str = "MAY 1 2013";
        System.out.println(str + " " + isDateOdd(str));
    }

    public static boolean isDateOdd(String date)
    {
        Date dates = new Date(date);
        if((dates.getMonth()+1)%2==0){
            return true;
        }else
            return false;
    }
}
