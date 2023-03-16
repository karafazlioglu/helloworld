package com.example.helloworld.problems;
import com.example.helloworld.Problem;

import java.util.Scanner;
public class Problem41 implements Problem {
    public void solution()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the char: ");
        String ch = in.next();

        for (int i = 0; i < ch.length(); i++)
        {
            char c = ch.charAt(i);
            int ascii = c;
            //int castAscii = c;

            System.out.println("The ASCII value of " + c + " is: " + ascii);
            //System.out.println("The ASCII value of " + c + " is: " + castAscii);
        }



    }

}
