package com.example.helloworld.problems;

import com.example.helloworld.Problem;

public class Problem15 implements Problem {
    public void solution()
    {
        int a,b;
        a = 15;
        b = 27;
        System.out.println("Before swapping a,b = " + a + " , " + b);

        a = a + b;
        b = a - b; // (a + b) - b = a;
        a = a - b; // (a + b) - a = b;

        System.out.println("After swapping a,b = " + a + " , " + b);
    }

}
