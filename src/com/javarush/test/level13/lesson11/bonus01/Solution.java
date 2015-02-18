package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        read(nameFile);
    }

    private static void sort(ArrayList<Integer> list)
    {
        for (int i = list.size() - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (list.get(i) < list.get(j))
                {
                    int tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
        for (int i : list)
            if (i % 2 == 0)
                System.out.println(i);
    }

    private static void read(String nameFile)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        try
        {
            InputStream in = new FileInputStream(nameFile);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nameFile));
            while (bufferedReader.ready())
            {
                int value = Integer.parseInt(bufferedReader.readLine());
                list.add(value);
            }
            sort(list);
            in.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
