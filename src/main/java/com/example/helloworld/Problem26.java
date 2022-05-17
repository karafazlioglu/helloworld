package com.example.helloworld;

import java.util.Scanner;

public class Problem26
{
    public void solution26()
    {
        Scanner sc = new Scanner(System.in);

        long octalNumber, decimalNumber = 0, j = 1, remainder;

        System.out.print("Input octal number: ");
        octalNumber = sc.nextLong();

        while (octalNumber != 0)
        {
            remainder = octalNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 8;
            octalNumber = octalNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);

        long[] binary = new long[130];

        int i = 0;

        while (decimalNumber != 0)
        {
            long quotient = decimalNumber / 2;
            long rem = decimalNumber % 2;

            binary[i] = rem;
            i++;

            decimalNumber = quotient;
        }
        System.out.print("Binary number: ");

        for (int k = i - 1 ; k >= 0; k--)
        {
            System.out.print(binary[k]);

            if ( k % 4 == 0 )
                System.out.print(" ");
        }
        System.out.println(" ");
    }
}
