package com.example.helloworld.problems;

import com.example.helloworld.Problem;

public class Problem14 implements Problem {
    public void solution()
    {
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++)
        {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++)
        {
            System.out.println(p2);
        }
    }

}
