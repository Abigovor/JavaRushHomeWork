package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    String name;
    int old;
    String pol;

    public Friend(String name)
    {
        this.name = name;
    }

    public Friend(String name, int old)
    {
        this.name = name;
        this.old = old;
    }

    public Friend(String name, int old, String pol)
    {
        this.name = name;
        this.old = old;
        this.pol = pol;
    }
}
