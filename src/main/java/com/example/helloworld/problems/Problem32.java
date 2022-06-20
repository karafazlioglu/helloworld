package com.example.helloworld.problems;
import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem32 implements Problem {
    public void solution()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int first = in.nextInt();

        System.out.print("Input second integer: ");
        int second = in.nextInt();

        if (first == second)
            System.out.printf("%d == %d\n", first, second);

        if (first != second)
            System.out.printf("%d != %d\n", first, second);

        if (first < second)
            System.out.printf("%d < %d\n", first, second);

        if (first > second)
            System.out.printf("%d > %d\n", first, second);
            
        if (first <= second)
            System.out.printf("%d <= %d\n", first, second);
            
        if (first >= second)
            System.out.printf("%d >= %d\n", first, second);
    }

}
