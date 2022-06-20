package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem3 implements Problem
{
    public void solution()
    {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        float num1 = input.nextInt();

        System.out.println("Enter the first number: ");
        float num2 = input.nextInt();

        float division = num1 / num2;

        System.out.println("The result is: " + new DecimalFormat("###.###").format(division));
    }
}

