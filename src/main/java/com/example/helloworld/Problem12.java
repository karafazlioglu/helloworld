package com.example.helloworld;

import java.util.Scanner;

public class Problem12
{
    public static void solution12()
    {
        double num = 0;
        double x = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number(n) you want to calculate the average: ");

        int n = sc.nextInt();

        while (x <= n) {
            System.out.println("Input number " + "("+ (int) x +")" + ":");
            num += sc.nextInt();
            x += 1;
        }
        double avgn = (num / n);

        System.out.println("Average:" + avgn);
    }
}

