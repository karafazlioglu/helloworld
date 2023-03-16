package com.example.helloworld.problems;
import com.example.helloworld.Problem;

import java.util.*;


public class Problem51 implements Problem
{
    public void solution()
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number(string): ");
        // String str = sc.nextLine();


        String str = "12.499,00 TL";

        int[] intList = new int[6];

        for (int i = 0; i < intList.length; i++)
        {
            char c = str.charAt(i);
            int ascii = c;
            if (ascii < 58 & ascii > 47)
            {
                intList[i] = (ascii - 48);
            }
        }

        for (int j = 0; j < intList.length; j ++)
            System.out.println(intList[j]);
    }

}
