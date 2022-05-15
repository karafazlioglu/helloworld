package com.example.helloworld;
import java.lang.*;

public class Problem37
{
    public void solution37()
    {
        String input = "Geeks for Geeks";

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}
