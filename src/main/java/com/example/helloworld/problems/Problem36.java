package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem36 implements Problem {
    public void solution()
    {
        System.out.println("Distance between the two points [ (x1,y1) & (x2,y2)]");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the latitude of the coordinate 1: ");

        double lat1 = in.nextDouble();
        lat1 = Math.toRadians(lat1);

        System.out.println("Input the longitude of coordinate 1: ");

        double lon1 = in.nextDouble();
        lon1 = Math.toRadians(lon1);

        System.out.println("Enter the latitude of the coordinate 2: ");

        double lat2 = in.nextDouble();
        lat2 = Math.toRadians(lat2);

        System.out.println("Input the longitude of coordinate 2: ");

        double lon2 = in.nextDouble();
        lon2 = Math.toRadians(lon2);

        double radius = 6371.01;

        double d = radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon2 - lon1));

        System.out.println("The distance between those points is: " + d);

    }
}
