package com.example.helloworld;

public class Problem15
{
    public static void solution15()
    {
        int a,b;
        a = 15;
        b = 27;
        System.out.println("Before swapping a,b = " + a + " , " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping a,b = " + a + " , " + b);


    }
}
