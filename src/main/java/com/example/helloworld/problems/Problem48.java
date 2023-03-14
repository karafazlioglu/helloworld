package com.example.helloworld.problems;

import com.example.helloworld.Problem;

public class Problem48 implements Problem
{
    public void solution()
    {
        for (int i = 1; i < 101; i++)
        {
            System.out.println(2 * i - 1);
        }
    }
}
