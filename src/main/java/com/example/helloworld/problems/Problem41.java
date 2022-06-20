package com.example.helloworld.problems;
import java.util.Scanner;
public class Problem41
{
    public void solution41()
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
