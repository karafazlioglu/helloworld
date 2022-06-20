package com.example.helloworld.promlems;

public class Problem38
{
    public void solution()
    {
        String str = "Hello world!1";

        int space = 0;
        int letter = 0;
        int number = 0;
        int other = 0;

        for (char c : str.toCharArray())
        {
            if (Character.isSpaceChar(c))
                space++;
            else if (Character.isLetter(c))
                letter++;
            else if (Character.isDigit(c))
                number++;
            else
                other++;
        }

        System.out.println(" Number of spaces in the string is = " + space);
        System.out.println(" Number of letters in the string is = " + letter);
        System.out.println(" Number of numbers in the string is = " + number);
        System.out.println(" Number of others is in the string is = " + other);
    }
}
