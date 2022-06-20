package com.example.helloworld.promlems;
import java.util.Scanner;
public class Problem22
{
    public void solution22()
    {
        Scanner sc = new Scanner(System.in);

        long binaryNumber;
        long decimalNumber = 0;
        long j = 1;
        long remainder;

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
    }
}
