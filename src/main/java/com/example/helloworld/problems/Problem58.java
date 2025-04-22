package com.example.helloworld.problems;

import com.example.helloworld.Problem;

import java.util.Scanner;

public class Problem58 implements Problem {
    public void solution() {
        Scanner in = new Scanner(System.in);
        // Write down a sentence to capitalize the first letter of each word.
        System.out.println("Enter a sentence: ");
        char[] letters = in.nextLine().toCharArray();
        System.out.println("Default sentence: ");
        System.out.println(letters);

        for (int i = 0; i < letters.length -2 ; i++) {
            if (letters[i + 1] == ' ') {
                letters[i + 2] = Character.toUpperCase(letters[i + 2]);
            } else if ( i == 0) {
                letters[i] = Character.toUpperCase(letters[i]);
            }
        }
        System.out.println("First letter capitalized: ");
        System.out.println(letters);
    }
//    public static String result(String str){
//        for (int i = 1; i <= str.length(); i ++){
//            if (str.charAt(i - 1) == ' ' || i - 1 == 0){
//                char ch = str.charAt(i) ;
//                ch = Character.toUpperCase(ch);
//            }
//        }
//        return str;
//    }
}
