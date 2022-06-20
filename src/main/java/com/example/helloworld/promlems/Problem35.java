package com.example.helloworld.promlems;

import java.util.Scanner;

public class Problem35
{
    public void solution()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of sides in polygon: ");

        int n = in.nextInt();

        System.out.println("Enter the length of one of the sides: ");

        int s = in.nextInt();

        System.out.println("Area of a polygon = (n*s^2)/(4*tan(π/n)) = " + (n * s * s) / (4 * Math.tan(Math.PI / n)));


    }
}
