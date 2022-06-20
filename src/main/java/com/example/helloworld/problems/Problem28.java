package com.example.helloworld.problems;

import java.util.Scanner;

public class Problem28
{
    public void solution()
    {
        Scanner sc = new Scanner(System.in);

        String hexadecimalNumber;

        System.out.print("Input a hexadecimal number: ");
        hexadecimalNumber = sc.next();
        String hex = hexadecimalNumber.toLowerCase();

        String hexDecimal = "0123456789abcdef";

        int[] b = new int[200];

        int k = 1;
        int i;

        for (i = hex.length() - 1; i >= 0; i--)
        {
            char c = hex.charAt(i);
            int a = hexDecimal.indexOf(c);
            b[i] = a * k;
            k = k * 16;
        }

        int sum = 0;
        for (int j = b.length - 1; j >= 0; j--)
            sum = sum + b[j];

        System.out.println("Decimal number of " + hex + " is: " + sum);
    }
}
