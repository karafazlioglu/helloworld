package com.example.helloworld.promlems;
import java.util.Scanner;

public class Problem32
{
    public void solution32()
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
