package com.javarush.test.level06.lesson08.task05;

/* Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

public class StringHelper
{
    public static String multiply(String s)
    {
        String result = s;
        for(int i = 0; i < 4; i++)
        {
            result = result + s;
        }
        return result;
    }

    public static String multiply(String s, int count)
    {
        String result = "";
        for (int i = 0; i < count; i++)
        {
            result = result + s;
        }
        return result;
    }
	
	public static void main(String[] args) {
        System.out.print(new StringHelper().multiply("asd "));
        System.out.println();
        System.out.print(new StringHelper().multiply("asd ",3));
    }
}
