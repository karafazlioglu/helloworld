package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem499 implements Problem
{
    public void solution()
    {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        for (int i = 0; i <= strs.length - 2; i++)
        {
            for (int j = i + 1; j <= strs.length - 1; j++)
            {
                String firstLetter = strs[i];
                String secondLetter = strs[j];

                char[] first = new char[firstLetter.length()];
                char[] second = new char[secondLetter.length()];

                for (int k = 0; k < firstLetter.length(); k++)
                {
                    first[k] = firstLetter.charAt(k);
                }

                for (int k = 0; k < secondLetter.length(); k++)
                {
                    second[k] = secondLetter.charAt(k);
                }

                for (int l = 0; l <= first.length - 1; l++)
                {
                    for (int m = 0; m <= second.length - 1; m++)
                    {
                        if (first[l] == second[m])
                        {
                            first[l] = second[m] = 0;
                            break;
                        }
                    }
                }

                for (int p = 0; p < first.length; p++)
                {
                    if (first[p] != 0)
                    {
                        boolean bl = false;
                        if (bl = true)
                        {
                            String output[] = {firstLetter, secondLetter};
                        }
                    }

                }

            }

        }




    }
}
