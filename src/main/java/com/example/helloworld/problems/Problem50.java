package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.io.File;

public class Problem50 implements Problem
{
    public void solution()
    {
        int[] nums = new int[300];          // list named nums is created to be filled later
        int n = 0;                          // integer named n is initialized to be used in for loop
        for (int i = 1; i < 100; i ++)      // started from 1 to 100 every integer value will be in the for loop
        {
            if (i % 3 == 0)                 // every value of the list will be divided by 3
            {
                nums[n] = i;                // if next index can be divided by 3, it will go to the value of index n
                n = n + 1;                  // for every if clause, n will be one more
            }
        }

        for (int j = 0; j < n; j ++)                // another for loop is created to print the whole list
            System.out.print(nums[j] + ", ");       // comma is put between every element of the list

        System.out.println();                       // a blank line is created to pass to second part of the problem

        int[] nums1 = new int[300];                 // a new list of nums1 is created for second part
        int m = 0;

        for (int l = 1; l < 100; l ++)
        {
            if (l % 5 == 0)
            {
                nums1[m] = l;
                m++;
            }
        }

        for (int k = 0; k < m; k ++)
            System.out.print(nums1[k] + ", ");

        System.out.println();

        int[] nums2 = new int[300];
        int o = 0;

        for (int p = 1; p < 100; p ++)
        {
            if (p % 3 == 0 & p % 5 == 0)
            {
                nums2[o] = p;
                o++;
            }
        }

        for (int r = 0; r < o; r++)
            System.out.print(nums2[r] + ", ");
    }
}
