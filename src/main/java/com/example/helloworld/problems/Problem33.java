package com.example.helloworld.problems;
import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem33 implements Problem {
    public void solution()
    {
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");

        long n = input.nextLong();

        while (n != 0)
        {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
