package com.example.helloworld.problems;

import com.example.helloworld.Problem;

public class Problem39 implements Problem {
    public void solution()
    {
        int totalAmount = 0;

        for(int i = 1; i < 5; i++)
        {
            for (int j = 1; j < 5; j++)
            {
                for(int k = 1; k < 5; k++)
                {
                    if (i != k && k != j && j != i)
                    {
                        totalAmount++;
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
        System.out.println("Total amount ogf numbers is : " + totalAmount);
    }
}
