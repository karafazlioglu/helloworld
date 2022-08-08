package com.example.helloworld;

import java.util.ArrayList;

public class Sort
{
    public static void sortNumbers()
    {
        int[] randomNumbers = {10, 2, 2548, 1, 256, 89, 7, 95, 358, 32};
        int[] smallerToGrater = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] greaterToSmaller = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int loopCount = 0;

//
//        for (int number : randomNumbers) System.out.print(number + " ");
//        System.out.println(" ");
//        loopCount = method1(randomNumbers, false);
//        for (int number : randomNumbers) System.out.print(number + " ");
//        System.out.println(" ");
//        System.out.println("I sorted this array greater to smaller by looping " + loopCount + " times");
//
//        for (int number : smallerToGrater) System.out.print(number + " ");
//        System.out.println(" ");
//        loopCount = method1(smallerToGrater, false);
//        for (int number : smallerToGrater) System.out.print(number + " ");
//        System.out.println(" ");
//        System.out.println("I sorted this array greater to smaller by looping " + loopCount + " times");
//
//
//        for (int number : greaterToSmaller) System.out.print(number + " ");
//        System.out.println(" ");
//        loopCount = method1(greaterToSmaller, false);
//        for (int number : greaterToSmaller) System.out.print(number + " ");
//        System.out.println(" ");
//        System.out.println("I sorted this array greater to smaller by looping " + loopCount + " times");






        for (int number : randomNumbers) System.out.print(number + " ");
        System.out.println(" ");
        loopCount = method2(randomNumbers, false);
        for (int number : randomNumbers) System.out.print(number + " ");
        System.out.println(" ");
        System.out.println("I sorted this array greater to smaller by looping " + loopCount + " times");

        for (int number : smallerToGrater) System.out.print(number + " ");
        System.out.println(" ");
        loopCount = method2(smallerToGrater, false);
        for (int number : smallerToGrater) System.out.print(number + " ");
        System.out.println(" ");
        System.out.println("I sorted this array greater to smaller by looping " + loopCount + " times");


        for (int number : greaterToSmaller) System.out.print(number + " ");
        System.out.println(" ");
        loopCount = method2(greaterToSmaller, false);
        for (int number : greaterToSmaller) System.out.print(number + " ");
        System.out.println(" ");
        System.out.println("I sorted this array greater to smaller by looping " + loopCount + " times");


    }

    public static int method1(int[] randomNumbers, boolean debug)
    {
        if (debug)
            System.out.println("############################");

        int loopCount = 0;
        boolean allSorted = false;
        while (!allSorted)
        {
            allSorted = true;
            for (int i = 0; i < randomNumbers.length - 1; i++)
            {
                if (randomNumbers[i] < randomNumbers[i+1])
                {
                    allSorted = false;
                    int num = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[i + 1];
                    randomNumbers[i + 1] = num;
                }

                if (debug)
                {
                    for (int number : randomNumbers) System.out.print(number + " ");
                    System.out.println(" ");
                }
                loopCount += 1;
            }
            if (debug)
                System.out.println("############################");
        }

        return loopCount;
    }

    public static int method2(int[] randomNumbers, boolean debug)
    {
        if (debug)
            System.out.println("############################");

        int loopCount = 0;

        for (int j = 0; j < randomNumbers.length; j++)
        {
            for (int i = 0; i < (randomNumbers.length - j - 1); i++)
            {
                if (randomNumbers[i] < randomNumbers[i+1])
                {
                    int num = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[i + 1];
                    randomNumbers[i + 1] = num;
                }

                if (debug)
                {
                    for (int number : randomNumbers) System.out.print(number + " ");
                    System.out.println(" ");
                }
                loopCount += 1;
            }
            if (debug)
                System.out.println("############################");
        }
        return loopCount;
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
        int loopCount = 0;

        while (!allSorted)
        {
            allSorted = true;
            for (int i = 0; i < numbers.size() - 1; i++)
            {
                if (numbers.get(i) < numbers.get(i + 1))
                {
                    allSorted = false;
                    num = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, num);
                    loopCount += 1;

                }
            }
        }
        System.out.println(numbers);
        System.out.println("I sorted this array greater to smaller by looping " + loopCount + " times");
    }
}
