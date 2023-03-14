package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.io.File;

public class Problem50 implements Problem
{
    public void solution()
    {
        int[] nums = new int[300];
        int n = 0;
        for (int i = 1; i < 100; i ++)
        {
            if (i % 3 == 0)
            {
                nums[n] = i;
                n = n + 1;
            }
        }

        for (int j = 0; j < n; j ++)
            System.out.print(nums[j] + ", ");

        System.out.println();

        int[] nums1 = new int[300];
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
