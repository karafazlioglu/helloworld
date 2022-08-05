package com.example.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Application
{
    // https://www.w3resource.com/java-exercises/basic/index.php

    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int[] number = {10, 2, 2548, 1, 256, 89, 7, 95, 358, 32};
        for (int j : number) numbers.add(j);
        int num;
        boolean allSorted = false;
        int tour = 0;
        while (!allSorted)
        {
            allSorted = true;
            for (int i = 0; i < numbers.size() - 1; i++)
            {
                if (numbers.get(i) < numbers.get(i + 1))
                {
                    allSorted = false;
                    num = numbers.get(i);
                    numbers.remove(i);
                    numbers.add(num);
                }
            }
            tour += 1;
        }
        System.out.println(numbers);
        System.out.println("I sorted this array greater to smaller by looping " + tour + " times");

       // System.out.println("Hello world!");

       // Scanner input = new Scanner (System.in);
       // System.out.println("Enter the problem number: ");
        //int problemNo = input.nextInt();

       // try
        //{
        //    // createProblem
        //    Problem p = ProblemGenerator.createProblem(problemNo);
        //    // call solution
        //    p.solution();
       // }
       // catch (Exception e)
        //{
         //   System.err.println(e.getMessage());
        //}
    }


}
