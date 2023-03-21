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

        for (int j = 0; j < intList.length; j ++)   // The print of the list is done sequentially in a single line
             System.out.print(intList[j]);
    }

}
