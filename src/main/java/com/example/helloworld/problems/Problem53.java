package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem53 implements Problem
{
    public void solution()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number; ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number; ");
        int num2 = in.nextInt();

        System.out.println("Enter the third number; ");
        int num3 = in.nextInt();

        // num1 < num2 < num 3

        boolean result;
        boolean abc = true;

        result = num1 < num2 & num2 < num3;

        if (abc)
        {
            result = num2 < num3;
        }

        System.out.print("The result is: " +  result);

    }

}
