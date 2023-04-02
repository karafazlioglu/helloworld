package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem52 implements Problem
{
    public void solution2()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number; ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number; ");
        int num2 = in.nextInt();

        System.out.println("Enter the third number; ");
        int num3 = in.nextInt();

        boolean result;

        if (num1 + num2 == num3)
        {
            result = true;
        }
        else if (num2 + num3 == num1)
        {
            result = true;
        }
        else if (num3 + num1 == num2)
        {
            result = true;
        }
        else
        {
            result = false;
        }

        System.out.println(result);
    }
    public void solution()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number; ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number; ");
        int num2 = in.nextInt();

        System.out.println("Enter the third number; ");
        int num3 = in.nextInt();

        System.out.println((num1 + num2) == num3 || num1 + num3 == num2 || num2 + num3 == num1);

    }


}
