package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem57 implements Problem {
    public void solution2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer to count its factors: ");
        int number = in.nextInt();

        int total = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                total += 1;
            }
        }

        System.out.println("The total number of factors of the " + number + " is: " + total);
    }

    public void solution() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer to count its factors: ");
        int num = in.nextInt();
        System.out.println(result(num));

    }

    public static int result(int num) {
        int total = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                total += 1;
            }

        }
        return total;

    }
}
