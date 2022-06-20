package com.example.helloworld.problems;

import java.util.Scanner;

public class Problem25
{
    public void solution25()
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
    }
}
