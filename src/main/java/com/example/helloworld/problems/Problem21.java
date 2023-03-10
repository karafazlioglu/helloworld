package com.example.helloworld.problems;
import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem21 implements Problem {
    public void solution()
    {
        int i = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");

        int decimal = sc.nextInt();

        int[] octalList = new int[100];

        int quotient = decimal;

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
