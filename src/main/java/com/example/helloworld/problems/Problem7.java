package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem7 implements Problem {
    public void solution()
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
