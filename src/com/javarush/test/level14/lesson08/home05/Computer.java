package com.javarush.test.level14.lesson08.home05;

/**
 * Created by admin on 14.01.15.
 */
public class Computer
{
    Mouse mouse;
    Keyboard keyboard;
    Monitor monitor;

    public Computer()
    {
        this.mouse = new Mouse();
        this.keyboard = new Keyboard();
        this.monitor = new Monitor();
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }
}
