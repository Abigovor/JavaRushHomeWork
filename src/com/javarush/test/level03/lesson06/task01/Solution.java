package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String a = "Мама";
        String b = "Мыла";
        String s = "Раму";

        System.out.println( a + b + s );
        System.out.println( s + b + a );
        System.out.println( b + a + s );
        System.out.println( a + s + b );
        System.out.println( b + s + a );
        System.out.println( s + a + b );

    }
}