package com.example.helloworld;

import java.util.Scanner;

public class Problem3
{
    public void solution3()
    {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the first number: ");
        int num2 = input.nextInt();

        int division = num1 / num2;

        System.out.println("The result is: " + division);
    }
}

