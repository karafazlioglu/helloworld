package com.example.helloworld;

import java.util.Scanner;

public class Problem26
{
    public void solution()
    {
        Scanner sc = new Scanner(System.in);

        long octalNumber;

        System.out.print("Input octal number: ");
        octalNumber = sc.nextLong();

        int i = 0;

        long[] decimal = new long[100];

        while (octalNumber != 0)
        {
            long remainder = octalNumber % 10;

            for(int k = 0; k < 3; k++)
            {
                long quotient = remainder / 2;
                long rem = remainder % 2;
                decimal[i] = rem;
                remainder = quotient;
                i ++;
            }
            octalNumber /= 10;
        }

        for (int j = i - 1 ; j >= 0; j--)
        {
            System.out.print(decimal[j]);
            if ( j % 4 == 0 )
                System.out.print(" ");
        }
        System.out.println(" ");
    }
}
