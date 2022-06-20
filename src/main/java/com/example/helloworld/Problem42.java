package com.example.helloworld;
import java.io.Console;
import java.io.*;
import java.util.Arrays;

public class Problem42
{
    public void solution()
    {
        Console cnsl = System.console();

        if (cnsl == null)
        {
            System.out.println("No console available");
            return;
        }

        // Read line
        String str = cnsl.readLine("Enter username : ");

        // Print username
        System.out.println("Username : " + str);

        // Read password
        // into character array
        char[] ch = cnsl.readPassword("Enter password : ");

        // Print password
        System.out.println("Password : " + new String(ch));
    }
}
