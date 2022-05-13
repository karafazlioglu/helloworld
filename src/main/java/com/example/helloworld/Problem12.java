package com.example.helloworld;

import java.util.Scanner;

public class Problem12
{
    public void solution12()
    {
        double sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the count of numbers (n) you want to calculate the average: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            System.out.println("Input number " + "("+ (int) i +")" + ":");
            sum += sc.nextInt();
        }

        double avgn = (sum / n);

        System.out.println("Average:" + avgn);
    }
}

