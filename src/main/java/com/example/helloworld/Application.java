package com.example.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Application
{
    // https://www.w3resource.com/java-exercises/basic/index.php

    public static void main(String[] args)           // main method is initialized to choose the problem number
    {
        // sort methods created in sort class is called here
        //Sort.sortNumbers2();
       // Sort.sortNumbers();


       System.out.println("Hello world!");      // First code of me is added to the first line that prints Hello world

       Scanner input = new Scanner (System.in);     // A new scanner called input is defined
       System.out.println("Enter the problem number: ");            // Problem number is asked to the user here
       int problemNo = input.nextInt();         // an integer named problemNo is initialized by answered problem number

       try      //  to catch the wrong problem number exception, try method is used
        {
        //    createProblem
            Problem p = ProblemGenerator.createProblem(problemNo);     // method from problem generator class is called and stored to problem p
             //call solution
            p.solution();       // each problem's solution method is called here
        }
        catch (Exception e)         // exception called e is caught here
        {
            System.err.println(e.getMessage());     // finally error message of e is printed here
        }
    }


}
