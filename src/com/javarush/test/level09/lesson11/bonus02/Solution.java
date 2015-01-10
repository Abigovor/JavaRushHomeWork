package com.javarush.test.level09.lesson11.bonus02;

import java.io.*;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/

public class Solution
{
    static FileInputStream fileInputStream;
    static FileOutputStream fileOutputStream;

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = null;
        String sourceFileName = reader.readLine();
        File file = new File("C:\\Users\\admin\\Desktop\\данные\\ziener\\java_prog\\Project\\JavaRushHomeWork\\src\\com\\javarush\\test\\level09\\lesson11\\bonus02\\" + sourceFileName + ".txt");
        while (!file.exists())
            try
            {
                fileInputStream = new FileInputStream(sourceFileName);
            }
            catch (FileNotFoundException e)
            {
                System.out.println("Файл не существует.");
                sourceFileName = reader.readLine();
                file = new File("C:\\Users\\admin\\Desktop\\данные\\ziener\\java_prog\\Project\\JavaRushHomeWork\\src\\com\\javarush\\test\\level09\\lesson11\\bonus02\\" + sourceFileName + ".txt");
            }
        fileInputStream = new FileInputStream(file);

        String destinationFileName = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\admin\\Desktop\\данные\\ziener\\java_prog\\Project\\JavaRushHomeWork\\src\\com\\javarush\\test\\level09\\lesson11\\bonus02\\" + destinationFileName + ".txt");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
