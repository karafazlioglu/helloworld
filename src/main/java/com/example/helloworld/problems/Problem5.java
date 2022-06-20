package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem5 implements Problem
{
    public void solution()
    {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the first number: ");
        int num2 = input.nextInt();

        int product = num1 * num2;

        System.out.println("The result is: " + product);
    }

}
