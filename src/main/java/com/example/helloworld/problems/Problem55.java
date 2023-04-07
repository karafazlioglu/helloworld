package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem55 implements Problem
{
    public void solution()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter seconds; ");
        double seconds = in.nextDouble();

        // seconds = 3658; 3685 / 3600 = sa;
        double hours = seconds / 3600;
        double minutes = (hours - (int)hours) * 60;
        double second = (minutes - (int)minutes) * 60;

        System.out.println("The result is: " + (int)Math.floor(hours) + ":" + (int)Math.floor(minutes) + ":" + (int)Math.ceil(second));     // integer
        //System.out.println("The result is: " + hours + ":" + minutes + ":" + second);     // double
    }
}
