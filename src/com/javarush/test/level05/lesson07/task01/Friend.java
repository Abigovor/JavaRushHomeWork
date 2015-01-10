package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    String name;
    int old;
    String gender;

    public void initialize (String name)
    {
        this.name = name;
    }

    public void initialize (String name, int old)
    {
        this.name = name;
        this.old = old;
    }


    public void initialize (String name, int old, String gender)
    {
        this.name = name;
        this.old = old;
        this.gender = gender;
    }

}
