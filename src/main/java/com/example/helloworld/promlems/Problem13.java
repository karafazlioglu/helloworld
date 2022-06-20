package com.example.helloworld.promlems;

import java.util.Scanner;

public class Problem13
{
    public void solution13()
    {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter the width: ");
        double width = io.nextDouble();

        System.out.println("Enter the height: ");
        double height = io.nextDouble();

        System.out.println("The perimeter is: " + 2 * (width + height) + " \tThe area is: " + width * height);
    }
}
