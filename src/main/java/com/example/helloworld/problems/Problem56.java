package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem56 implements Problem {
    public void solution()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter starting number of the range: ");
        int starting = in.nextInt();
        System.out.println("Enter ending number of the range: ");
        int ending = in.nextInt();
        System.out.println("Enter divisible number: ");
        int divisible = in.nextInt();

        // [x,y], mod p = 0
        int total = 0;

        for (int i = starting; i <= ending; i++){
            if (i % divisible == 0)
                total += 1;
        }

        System.out.println("The total numbers that can be divided by " + divisible + " is: " + total);
    }

    public void solution2() {
        int x = 5;
        int y = 20;
        int p = 3;
        System.out.println(result(x, y, p));
    }
    public static int result(int x, int y, int p) {
        if (x%p == 0)
            return( y/p - x/p + 1);
        return(y/p - x/p);
    }

}
