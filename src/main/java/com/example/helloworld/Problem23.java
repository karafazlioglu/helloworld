package com.example.helloworld;
import java.util.Scanner;

public class Problem23
{
    public void solution23()
    {
        Scanner sc = new Scanner(System.in);

        int binaryNumber, decimalNumber = 0, j = 1, remainder;
        char[] hexadecimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};


        // TODO binary to hex
        System.out.print("Input a binary number: ");
        binaryNumber = sc.nextInt();

        while (binaryNumber != 0)
        {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);

        StringBuilder hexadec = new StringBuilder();

        while(decimalNumber > 0)
        {
            int rem = decimalNumber % 16;
            hexadec.insert(0, hexadecimal[rem]);
            decimalNumber = decimalNumber / 16;
        }
        System.out.println("Hexadecimal number is " + hexadec);

    }
}
