package com.example.helloworld.problems;

import java.util.Scanner;

public class Problem6
{
    public void solution6()
    {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int prod = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("--------Results--------");
        System.out.println(("Sum is: " + sum));
        System.out.println(("Subtraction is: " + sub));
        System.out.println(("Product is: " + prod));
        System.out.println(("Division is: " + div));
        System.out.println(("Remainder is: " + mod));
    }
}
