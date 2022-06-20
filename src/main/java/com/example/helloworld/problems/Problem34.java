package com.example.helloworld.problems;
import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem34 implements Problem {
    public void solution()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side in m: ");

        int s = in.nextInt();

        System.out.println("Area of a hexagon = " + (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6)));
    }
}
