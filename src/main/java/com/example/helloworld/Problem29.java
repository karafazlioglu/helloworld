package com.example.helloworld;

import java.util.Scanner;

public class Problem29
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
    public void solution29()
    {
        String hexdec_num;

        int dec_num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        hexdec_num = scan.nextLine();

        dec_num = hex_to_decimal(hexdec_num);

        System.out.print("Equivalent decimal number is: " + dec_num+"\n");

        int binary[] = new int[30];

        int i = 0;

        while (dec_num != 0)
        {
            int quotient = dec_num / 2;
            //System.out.println(quotient);
            int remainder = dec_num % 2;
            binary[i] = remainder;

            i++;
            dec_num = quotient;
        }

        for (int j = i - 1 ; j >= 0; j--)
        {
            System.out.print(binary[j]);
            if ( j % 4 == 0 )
                System.out.print(" ");
        }
        System.out.println(" ");


    }
}
