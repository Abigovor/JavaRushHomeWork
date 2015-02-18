package com.javarush.test.level15.lesson12.home04;

/**
 * Created by admin on 17.01.15.
 */
public class Moon implements Planet
{
    private static Moon instanceMoon;

    private Moon(){}

    public static Moon getInstance(){
        return instanceMoon == null ? instanceMoon = new Moon() : instanceMoon;
    }
}
