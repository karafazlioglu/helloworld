package com.example.helloworld.problems;

import java.util.Scanner;

public class Problem19
{
    public void solution19()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = in.nextInt();

        int[] binary = new int[30];

        int i = 0;

        while (num != 0)
        {
            int quotient = num / 2;
            //System.out.println(quotient);
            int remainder = num % 2;
            binary[i] = remainder;

            i++;
            num = quotient;
        }

        for (int j = i - 1 ; j >= 0; j--)
        {
            System.out.print(binary[j]);
            if ( j % 4 == 0 )
                System.out.print(" ");
        }
        System.out.println(" ");
    }
}
