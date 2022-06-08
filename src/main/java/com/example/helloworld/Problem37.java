package com.example.helloworld;
import java.lang.*;
import java.util.Scanner;

public class Problem37
{
    public void solution37()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = in.next();

        char[] b = new char[200];

        for (int i = string.length() - 1; i >= 0; i--)
        {
            char c = string.charAt(i);
            b[i] = c;
            System.out.print(b[i]);
        }
    }
}
