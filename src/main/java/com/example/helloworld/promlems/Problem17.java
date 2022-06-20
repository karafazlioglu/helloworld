package com.example.helloworld.promlems;

import java.util.Scanner;

public class Problem17
{
    public void test()
    {
        solution(0,0,0,0);
        solution(1,0,0,0);
        solution(0,1,0,0);
        solution(1,1,0,0);

        solution(0,0,1,0);
        solution(1,0,1,0);
        solution(0,1,1,0);
        solution(1,1,1,0);

        solution(0,0,0,1);
        solution(1,0,0,1);
        solution(0,1,0,1);
        solution(1,1,0,1);


        solution(0,0,1,1);
        solution(1,0,1,1);
        solution(0,1,1,1);
        solution(1,1,1,1);    
    }
    
    public void solutionWithScanner()
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter first character of first number: ");
        int fo1 = myObj.nextInt();  // Read user input

        System.out.println("Enter second character of first number: ");
        int so1 = myObj.nextInt();

        System.out.println("Enter first character of second number: ");
        int fo2 = myObj.nextInt();

        System.out.println("Enter second character of second number: ");
        int so2 = myObj.nextInt();
        solution(fo1, so1, fo2, so2);
        
    }
    public void solution(int fo1, int so1, int fo2, int so2)
    {
        int c1 = 0;
        int c2 = 0;
        int result0 = 0;
        int result1 = 0;

        if (so1 + so2 == 0)
        {
            result0 = 0;
        }
        else if (so2 + so1 == 1)
        {
            result0 = 1;
        }
        else
        {
            result0 = 0;
            c1 = 1;
        }

        if (c1 == 0)
        {
            if (fo1 + fo2 == 0)
            {
                result1 = 0;
            }
            else if (fo1 + fo2 ==1)
            {
                result1 = 1;
            }
            else
            {
                result1 =0;
                c2 = 1;
            }
        }
        else if (c1 == 1)
        {
            if (fo1 + fo2 == 0)
            {
                result1 = 1;
            }
            else if (fo1 + fo2 ==1)
            {
               result1 = 0;
                c2 = 1;
            }
            else
            {
                result1 = 1;
                c2 = 1;
            }
        }

        System.out.println(String.valueOf(fo1) + so1 + " " + fo2 + so2 + " Result is: " + c2 + result1 + result0 );
    }

    public void solution17()
    {
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input second binary number: ");
        binary2 = in.nextLong();

        while (binary1 != 0 || binary2 != 0)
        {
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);

            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0)
            sum[i++] = remainder;

        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0)
            System.out.print(sum[i--]);

        System.out.print("\n");
    }
}
