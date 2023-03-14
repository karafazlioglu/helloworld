package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem44 implements Problem
{
    public void solution()
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input an integer: ");

        int number = scn.nextInt();

        float total = number + (number * 10) + number + (number * 100) + (number * 10) + number;

        System.out.println("5 + 55 + 555 = " + total);


        System.out.printf("%d + %d%d + %d%d%d\n", number,number,number,number,number,number);


    }

}
