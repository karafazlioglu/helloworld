package com.example.helloworld.problems;
import com.example.helloworld.Problem;

import java.util.*;


public class Problem51 implements Problem
{
    public void solution()
    {
        String str = "25";            // A string that consists of a number is formed

        int[] intList = new int[str.length()];             // An integer list named intList is formed

        for (int i = 0; i < intList.length; i++)        // intList is added to for loop
        {
            char c = str.charAt(i);         // Strings that came from str are identified to char variable named c.
            int ascii = c;                  // ascii number of character in c is stored as integer ascii as ascii.

            intList[i] = (ascii - 48);  // numbers in the string move to intList that formed before as integer one by one
        }
        int t = 0;          // an integer named t is initialized by 0
        int n = intList.length;     // an integer named n is initialized by the value of the length of int length list
        for (int j = 0; j < intList.length; j ++)       // for loop is initialized to sum up numbers in order to their digits
        {
            int total = (int) (intList[j] * Math.pow(10 , n - 1));      // an integer called total is put into the for loop to calculate the decimal value of the index
            n --;           // integer that initialized by int list length is decreased by one for every loop
            t = total + t;      // integer called t is added to integer total for every loop
        }
        System.out.println(t);      // integer t is our last number that represents the integer value of given string
    }
}
