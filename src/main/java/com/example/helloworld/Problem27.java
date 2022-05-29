package com.example.helloworld;

import java.util.Scanner;

public class Problem27
{
    public void solution()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input octal number: ");
        int octalNumber = sc.nextInt();

        int i = 0;

        int[] binary = new int[100];

        int[] hex = new int[100];

        char[] hexDecimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        StringBuilder hexadecimal = new StringBuilder();

        while (octalNumber != 0)
        {
            int remainder = octalNumber % 10;

            for(int k = 0; k < 3; k ++)
            {
                int quotient = remainder / 2;
                int rem = remainder % 2;
                binary[i] = rem;
                remainder = quotient;
                i ++;
            }
            octalNumber /= 10;
        }

        for (int n = 0; n < (i / 4 + 1); n ++)
        {
            hex[n] = binary[4*n] + 2 * binary[4*n + 1] + 4 * binary[4*n + 2] + 8 * binary[4*n + 3];
            hexadecimal.insert(0, hexDecimal[(hex[n])]);
        }

        System.out.println("Hexadecimal number is " + hexadecimal);
    }
}
