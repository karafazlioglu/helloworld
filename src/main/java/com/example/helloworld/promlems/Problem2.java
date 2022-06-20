package com.example.helloworld.promlems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem2 implements Problem
{
    @Override
    public void solution()
    {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println(" Result is: " + sum);
    }
}

