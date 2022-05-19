package com.example.helloworld;
import java.util.Scanner;

public class Problem20
{
    public void solution20()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");

        int decimal = in.nextInt();

        StringBuilder hex = new StringBuilder();

        char[] hexadecimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while(decimal > 0)
        {
            int rem = decimal % 16;
            hex.insert(0, hexadecimal[rem]);
            decimal = decimal / 16;
        }
        System.out.println("Hexadecimal number is " + hex);
    }
}
