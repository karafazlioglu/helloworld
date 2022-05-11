package com.example.helloworld;

import java.util.Scanner;

public class Problem3
{
    public void solution3()
    {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        float num1 = input.nextInt();

        System.out.println("Enter the first number: ");
        float num2 = input.nextInt();

        float division = num1 / num2;

        // TODO float formatli yazma (2.33333 -->> 2.33)
        System.out.println("The result is: " + division);
    }
}

