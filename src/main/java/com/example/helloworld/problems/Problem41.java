package com.example.helloworld.problems;
import com.example.helloworld.Problem;

import java.util.Scanner;
public class Problem41 implements Problem {
    public void solution()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the char: ");
        String ch = in.next();

        char c = ch.charAt(0);
        int ascii = c;
        int castAscii = (int) c;

        System.out.println("The ASCII value of " + c + " is: " + ascii);
        System.out.println("The ASCII value of " + c + " is: " + castAscii);
    }

}
