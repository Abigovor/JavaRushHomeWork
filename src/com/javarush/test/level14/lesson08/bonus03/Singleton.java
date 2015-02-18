package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by admin on 15.01.15.
 */
public class Singleton
{
    private static final Singleton INSTANCE = new Singleton();
    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        return INSTANCE;
    }
}
