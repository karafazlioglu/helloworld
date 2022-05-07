package com.example.helloworld;

import java.util.Scanner;

public class Problem11
{
    public static void solution11()
    {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double radius = io.nextDouble();

        double perimeter = 2 * Math.PI* radius;
        double area = Math.PI * 7.5 * radius;

        System.out.println("Perimeter of the circle which has radius of 7.5 is: " + perimeter );
        System.out.println("Area of the circle which has radius of 7.5 is: " + area );
    }
}
