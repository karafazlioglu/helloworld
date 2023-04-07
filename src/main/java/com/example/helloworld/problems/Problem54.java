package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem54 implements Problem
{
    public void solution()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first positive number; ");
        double num1 = in.nextDouble();

        System.out.println("Enter the second positive number; ");
        double num2 = in.nextDouble();

        System.out.println("Enter the third positive number; ");
        double num3 = in.nextDouble();

        boolean result;

        // num1 = 595; 59.5 - 59 = 0.5'

        double[] nums = new double[3];
        double[] rightmost = new double[3];

        nums[0] = num1; nums[1] = num2; nums[2] = num3;

        for (int i = 0; i < nums.length; i++)
        {
            double division = nums[i] / 10 ;
            int value = (int)division;
            double right = 10 * (division - value);
            rightmost[i] = right;

        }
        result = (int)rightmost[0] == (int)rightmost[1] || (int)rightmost[0] == (int)rightmost[2] || (int)rightmost[1] == (int)rightmost[2];
        System.out.println(result);



    }

}
