package com.javarush.test.level15.lesson12.home04;

/**
 * Created by admin on 17.01.15.
 */
public class Sun implements Planet
{
    private static Sun instanceSun;

    private Sun(){}

    public static Sun getInstance(){
        if(instanceSun == null)
            instanceSun = new Sun();
        return instanceSun;
    }
}
