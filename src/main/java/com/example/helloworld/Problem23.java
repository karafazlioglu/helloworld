package com.example.helloworld;
import java.util.Scanner;

import static java.lang.System.*;

public class Problem23
{
    public void solution23()
    {
        Scanner sc = new Scanner(in);

        int binaryNumber;
        int remainder;
        int sum = 0;
        int sum2 = 0;
        int remainder2;
        int i, l;
        int j = 1;
        int k = 1;

        char[] hexaDecimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        // TODO binary to hex
        System.out.print("Input a binary number: ");
        binaryNumber = sc.nextInt();
        int binaryNumber2 = binaryNumber / 10000;

        for (i = 0; i < 4; i ++)
        {
            remainder = binaryNumber % 10;
            sum = sum + remainder * k;
            binaryNumber = binaryNumber / 10;
            k = 2 * k;
        }

        System.out.println(sum);

        for (l = 0; l < 4; l ++)
        {
            remainder2 = binaryNumber2 % 10;
            sum2 = sum2 + remainder2 * j;
            binaryNumber2 = binaryNumber2 / 10;
            j = 2 * j;
        }
        System.out.println(sum2);
        System.out.println("Hexadecimal number is " + hexaDecimal[sum2] + hexaDecimal[sum]);
    }
}
