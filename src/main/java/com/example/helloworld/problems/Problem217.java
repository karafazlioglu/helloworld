package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem217 implements Problem {
    public void solution()
    {

        int numbers[] = {1,2,5,6,7,8,9,9};

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers.length - 1 - i; j++)
            {
                if (numbers[i] == numbers[j + i + 1])
                {
                    boolean bol = true;
                    System.out.println(bol);
                }

            }


        }

    }
}
