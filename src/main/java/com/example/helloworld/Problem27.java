package com.example.helloworld;

import java.util.Scanner;

public class Problem27
{
    public void solution27()
    {
        Scanner sc = new Scanner(System.in);

        int octalNumber, decimalNumber = 0, j = 1, remainder;

        System.out.print("Input octal number: ");
        octalNumber = sc.nextInt();

        while (octalNumber != 0)
        {
            remainder = octalNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 8;
            
            octalNumber = octalNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);

        StringBuilder hexadec = new StringBuilder();

        char[] hexadecimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while(decimalNumber > 0)
        {
            int rem = decimalNumber % 16;
            hexadec.insert(0, hexadecimal[rem]);

            decimalNumber = decimalNumber / 16;
        }
        System.out.println("Hexadecimal number is " + hexadec);
    }
}
