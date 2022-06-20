package com.example.helloworld.problems;

import com.example.helloworld.Problem;

public class Problem10 implements Problem {
    public void solution()
    {
        double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result);
    }

}


