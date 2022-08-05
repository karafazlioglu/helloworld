package com.example.helloworld;

public class sort
{
    private void sortNumbers()
    {
        int[] numbers = {10, 2, 2548, 1, 256, 89, 7, 95, 358, 32};

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > numbers[i+1])
                numbers[i] = numbers[i + 1];
        }
        System.out.println(numbers);
    }
}
