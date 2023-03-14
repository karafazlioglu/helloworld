package com.example.helloworld.problems;
import java.io.File;


import com.example.helloworld.Problem;

public class Problem45 implements Problem
{
    public void solution()
    {
        System.out.println("home/students/abc.txt   : " + new File("abc.txt").length() + " bytes");
        System.out.println("home/students/test.txt  : " + new File("abc.txt").length() + " bytes");


    }
}
