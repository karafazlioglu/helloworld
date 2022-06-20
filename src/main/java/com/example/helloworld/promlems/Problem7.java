package com.example.helloworld.promlems;

import java.util.Scanner;

public class Problem7
{
    public void solution7()
        {
            Scanner input = new Scanner (System.in);

            System.out.println("Enter the first number: ");
            int num = input.nextInt();

            for (int i = 1; i <= 10; i++)
            {
                int prod = num * i;
                System.out.println(num + " * " + i + " is: " + prod);
            }
        }
}
