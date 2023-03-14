package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem49 implements Problem
{
    public void solution()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = in.nextInt();

        if (num % 2 == 0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(1);
        }
    }
}

