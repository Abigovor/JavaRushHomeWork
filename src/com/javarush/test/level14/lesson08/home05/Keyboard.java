package com.javarush.test.level14.lesson08.home05;

/**
 * Created by admin on 14.01.15.
 */
public class Keyboard implements CompItem
{
    @Override
    public String getName()
    {
        return this.getClass().getSimpleName();
    }
}
