package com.example.helloworld.problems;
import com.example.helloworld.Problem;

import java.util.Scanner;

import static java.lang.System.in;

public class Problem24 implements Problem {
    public void solution()
    {
        Scanner sc = new Scanner(in);
        System.out.print("Input a binary number: ");
        long binaryNumber = sc.nextLong();

        char[] octal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder oct = new StringBuilder();

        while(binaryNumber != 0)
        {
            long sum = 0;
            int k = 1;
            for (int i = 0; i < 3; i++)
            {
                long remainder = binaryNumber % 10;
                sum = (sum + remainder * k);
                binaryNumber = binaryNumber / 10;
                k = 2 * k;
            }
            oct.insert(0, octal[(int) sum]);
            System.out.println(oct);
        }
    }

}
