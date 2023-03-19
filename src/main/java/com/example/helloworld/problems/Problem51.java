package com.example.helloworld.problems;
import com.example.helloworld.Problem;

import java.util.*;


public class Problem51 implements Problem
{
    public void solution()
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number(string): ");
        // String str = sc.nextLine();


        String str = "25";            // str adında stringe sayı ve harften oluşan bir string depolanır.

        int[] intList = new int[str.length()];             // intList adında bir integer listesi tanımlanır

        for (int i = 0; i < intList.length; i++)        // intList for döngüsüne eklenir
        {
            char c = str.charAt(i);         // c adında açılan char değişkenine str stringinin karakterleri tanımlanır
            int ascii = c;                  // c karakterlerinin ascii numarası ascii olarak int depolanır
            if (ascii < 58 & ascii > 47)    // sadece rakamların listeye dahil edileceği için rakamların ascii numara aralığı if koşulu ile belirlenir
            {
                intList[i] = (ascii - 48);  // string içerisindeki rakamlar tek tek liste içerisine integer olarak dahil edilir.
            }
        }

        for (int j = 0; j < intList.length; j ++)   // listenin tek satırda sıralı halde gösterimi yapılır.
             System.out.print(intList[j]);
    }

}
