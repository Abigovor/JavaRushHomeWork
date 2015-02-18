package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution
{
    private Solution(){

    }
    protected Solution(int a ){

    }
    public Solution(int a, int b){

    }

    private Solution(double d){

    }
    protected Solution(double d, int a){

    }
    public Solution(double d, int a, int b){

    }

    private Solution(char c){

    }
    protected Solution(char c,int a ){

    }
    public Solution(char c,int a, int b){

    }

    Solution(char c, char a){

    }
    Solution(char c,int a, double d ){

    }
    Solution(char c,int a, Integer b){

    }
}

