package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args)
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            String name = reader.readLine();
            OutputStream out = new FileOutputStream(name);

            while(true)
            {
                String text = reader.readLine();
                String nextLine = System.getProperty("line.separator");


                out.write(text.getBytes());
                out.write(nextLine.getBytes());
                if(text.equals("exit")) break;
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
