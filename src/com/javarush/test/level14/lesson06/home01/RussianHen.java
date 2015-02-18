package com.javarush.test.level14.lesson06.home01;

/**
 * Created by admin on 14.01.15.
 */
public class RussianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 1;
    }
    public String getDescription(){

        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
