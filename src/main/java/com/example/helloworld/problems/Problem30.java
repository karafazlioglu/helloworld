package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem30 implements Problem {
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
        int j;
        int k;

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

        if (i % 3 != 0)
            i = i + 3 - (i % 3);

        StringBuilder octal = new StringBuilder();
        for (int n = 0; n < i/3; n++)
        {
            int dec = binary[3 * n] + 2 * binary[3 * n + 1] + 4 * binary[3 * n + 2];
            octal.insert(0, dec);
        }

        System.out.println("Octal number is " + octal);

    }

}
