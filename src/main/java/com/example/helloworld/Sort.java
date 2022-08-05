package com.example.helloworld;

import java.util.ArrayList;

public class Sort
{
    public static void sortNumbers()
    {
        int[] numbers = {10, 2, 2548, 1, 256, 89, 7, 95, 358, 32};

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > numbers[i+1])
                numbers[i] = numbers[i + 1];
        }
        System.out.println(numbers);
    }
    public static void sortNumbers2()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int[] number = {10, 2, 2548, 1, 256, 89, 7, 95, 358, 32};   // 1 . input
//        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};             // 2 . input
//        int[] number = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};             // 3 . input


        for (int j : number) numbers.add(j);
        int num;
        boolean allSorted = false;
        int tour = 0;
        while (!allSorted)
        {
            allSorted = true;
            for (int i = 0; i < numbers.size() - 1; i++)
            {
                tour += 1;

                if (numbers.get(i) < numbers.get(i + 1))
                {
                    allSorted = false;
                    num = numbers.get(i);
                    numbers.remove(i);
                    numbers.add(num);
                }
            }
        }
        System.out.println(numbers);
        System.out.println("I sorted this array greater to smaller by looping " + tour + " times");
    }
}
