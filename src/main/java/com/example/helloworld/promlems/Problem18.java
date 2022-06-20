package com.example.helloworld.promlems;
import java.util.Scanner;
public class Problem18
{
    public void solution18()
    {
        long binary1, binary2, multiply = 0;
        int digit, factor = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input the second binary number: ");
        binary2 = in.nextLong();
        while (binary2 != 0)
        {
            digit = (int)(binary2 % 10);
            binary1 = binary1 * factor;
            if (digit == 1)
            {
                multiply = binaryProduct((int) binary1, (int) multiply);
            }
            binary2 = binary2 / 10;
            factor = 10;
        }
        System.out.print("Product of two binary numbers: " + multiply+"\n");
    }

    private int binaryProduct(int binary1, int binary2)
    {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;

        while (binary1 != 0 || binary2 != 0)
        {
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0)
        {
            sum[i++] = remainder;
        }
        --i;
        while (i >= 0)
        {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }
        return binary_prod_result;
    }
}
