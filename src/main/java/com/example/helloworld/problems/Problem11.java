package com.example.helloworld.problems;

import java.util.Scanner;

public class Problem11
{
    public void solution11()
    {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double radius = io.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter of the circle which has radius of " + radius + " is: " + perimeter );
        System.out.println("Area of the circle which has radius of " + radius + " is: " + area );
    }
}
