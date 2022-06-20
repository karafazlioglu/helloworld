package com.example.helloworld.problems;
import com.example.helloworld.Problem;

import java.nio.charset.Charset;
public class Problem40 implements Problem {
    public void solution()
    {
        System.out.println("List of available character sets: ");
        for (String str : Charset.availableCharsets().keySet())
        {
            System.out.println(str);
        }
    }
}
