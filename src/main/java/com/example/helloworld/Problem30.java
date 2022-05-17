package com.example.helloworld;

import java.util.Scanner;

public class Problem30
{
    public static int hex_to_decimal(String s)
    {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();

        int val = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int d = digits.indexOf(c);

            val = 16 * val + d;
        }
        return val;
    }
    public void solution30()
    {
        String hexdec_num;

        int dec_num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        hexdec_num = scan.nextLine();

        dec_num = hex_to_decimal(hexdec_num);

        System.out.print("Equivalent decimal number is: " + dec_num+"\n");

        int i = 1;

        int[] octalList = new int[100];

        int quotient = dec_num;

        while (quotient != 0)
        {
            octalList[i++] = quotient % 8;
            quotient = quotient / 8;
        }
        System.out.print("Octal number: ");

        for (int j = i - 1 ; j > 0; j--)
        {
            System.out.print(octalList[j]);
            if ( j % 4 == 0 )
                System.out.print(" ");
        }
        System.out.println(" ");
    }
}
