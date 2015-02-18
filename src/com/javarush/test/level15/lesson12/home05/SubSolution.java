package com.javarush.test.level15.lesson12.home05;

/**
 * Created by admin on 17.01.15.
 */
public class SubSolution extends Solution
{
    private SubSolution(int a, int a1)
    {
        super(a);
        a = a1;
    }
    protected SubSolution(int a, int b, int a1)
    {
        super(a, b);
        a = a1;
    }
    public SubSolution(double d, int a, int b)
    {
        super(d, a);
    }

    private SubSolution(char c, int a, int a1)
    {
        super(c, a);
        a = a1;
    }
    protected SubSolution(char c, int a, int b, int b1)
    {
        super(c, a, b);
        b = b1;
    }
    public SubSolution(int a, Integer integer)
    {
        super(a);
    }

    private SubSolution(int a, int b, Integer integer)
    {
        super(a, b);
    }

    protected SubSolution(char c, int a, int b, Integer integer)
    {
        super(c, a, b);
    }

    public SubSolution(double d, int a, int b, Integer integer)
    {
        super(d, a, b);
    }

     SubSolution(int a, char b, Integer integer){
        super(a, b);
    }
     SubSolution(char c, char a, int b, Integer integer){
        super(c, a, b);
    }
     SubSolution(double d, Integer a, int b, Integer integer){
        super(d, a, b);
    }
}
