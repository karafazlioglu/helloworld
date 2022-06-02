package com.example.helloworld;

import java.util.Scanner;

public class Problem29
{
    public void solution()
    {
        Scanner sc = new Scanner(System.in);

        String hexadecimalNumber;

        System.out.print("Input a hexadecimal number: ");
        hexadecimalNumber = sc.next();
        String hex = hexadecimalNumber.toLowerCase();

        String hexDecimal = "0123456789abcdef";

        int i = 0;
        int[] binary = new int[200];
        int[] dec = new int[200];
        int j;
        int k;
        int l;

        for (k = hex.length() - 1; k >= 0; k--)
        {
            char c = hex.charAt(k);
            int decimal = hexDecimal.indexOf(c);

            for (j = 0; j < 4; j++)
            {
                int remainder = decimal % 2;
                binary[i] = remainder;
                int quotient = decimal / 2;
                decimal = quotient;
                i++;
            }
        }

        for ( l = hex.length() * 4 - 1; l >= 0 ; l--)
        {
            System.out.print(binary[l]);
            if ( l % 4 == 0 )
                System.out.print(" ");
        }
        System.out.println(" ");
    }
}
