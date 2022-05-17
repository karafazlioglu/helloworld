package com.example.helloworld;
import java.util.Scanner;

public class Problem24
{
    public void solution24()
    {
        Scanner sc = new Scanner(System.in);

        long binaryNumber, decimalNumber = 0, j = 1, remainder;

        System.out.print("Input a binary number: ");
        binaryNumber = sc.nextLong();

        while (binaryNumber != 0)
        {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);
//------------------------------------------------------------------------
        int i = 1;

        int[] octalList = new int[100];

        int quotient = (int) decimalNumber;

        while (quotient != 0)
        {
            octalList[i++] = quotient % 8;
            quotient = quotient / 8;
        }
        System.out.print("Octal number: ");

        for (int k = i - 1 ; k > 0; k--)
        {
            System.out.print(octalList[k]);
            if ( k % 4 == 0 )
                System.out.print(" ");
        }
        System.out.println(" ");
    }
}
