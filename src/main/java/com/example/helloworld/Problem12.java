package com.example.helloworld;

import java.util.Scanner;

public class Problem12
{
    public static void solution12()
    {
        double sum = 0;
        double x = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the count of numbers (n) you want to calculate the average: ");
        int n = sc.nextInt();

        // TODO for
        while (x <= n) {
            System.out.println("Input number " + "("+ (int) x +")" + ":");
            sum += sc.nextInt();
            x += 1;
        }

        double avgn = (sum / n);

        System.out.println("Average:" + avgn);
    }
}

