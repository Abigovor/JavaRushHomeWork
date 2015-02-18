package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by admin on 17.01.15.
 */
public abstract class DrinkMaker
{
    abstract void getRightCup();

    abstract void putIngredient();

    abstract void pour();

    public void makeDrink()
    {
        this.getRightCup();
        this.putIngredient();
        this.pour();
    }
}
