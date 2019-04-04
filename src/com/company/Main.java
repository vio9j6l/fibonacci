package com.company;

//Fibonacci Series using Recursion
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
//Fn = Fn-1 + Fn-2
class fibonacci
{
    static int fib(int n)
    {
        if (n <= 1)
            return n; //Base Case
        return fib(n-1) + fib(n-2);
    }
    public static void main (String args[])
    {
        int n = 9; //Output will be 34
        System.out.println(fib(n));
    }
}
