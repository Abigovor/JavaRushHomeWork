package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        //System.out.print("Введите имя: ");
        String mane1 = reader.readLine();
        //System.out.print("Введите имя: ");
        String mane2 = reader.readLine();
       // System.out.print("Введите имя: ");
        String mane3 = reader.readLine();
        System.out.println(mane1 + " + " + mane2 + " + " + mane3 + " = Чистая любовь, да-да!");

    }
}