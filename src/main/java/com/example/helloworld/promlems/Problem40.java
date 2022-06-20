package com.example.helloworld.promlems;
import java.nio.charset.Charset;
public class Problem40
{
    public void solution40()
    {
        System.out.println("List of available character sets: ");
        for (String str : Charset.availableCharsets().keySet())
        {
            System.out.println(str);
        }
    }
}
