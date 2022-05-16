package com.example.helloworld;
import java.util.Scanner;
public class Application
{
    // https://www.w3resource.com/java-exercises/basic/index.php

    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the problem number: ");
        int problemNo = input.nextInt();

        switch (problemNo)
        {
            case 1:
                Problem1 p1 = new Problem1();
                p1.solution1();
                break;
            case 2:
                Problem2 p2 = new Problem2();
                p2.solution2();
                break;
            case 3:
                Problem3 p3 = new Problem3();
                p3.solution3();
                break;
            case 4:
                Problem4 p4 = new Problem4();
                p4.solution4();
                break;
            case 5:
                Problem5 p5 = new Problem5();
                p5.solution5();
                break;
            case 6:
                Problem6 p6 = new Problem6();
                p6.solution6();
                break;
            case 7:
                Problem7 p7 = new Problem7();
                p7.solution7();
                break;
            case 8:
                Problem8 p8 = new Problem8();
                p8.solution8();
                break;
            case 9:
                Problem9 p9 = new Problem9();
                p9.solution9();
                break;
            case 10:
                Problem10 p10 = new Problem10();
                p10.solution10();
                break;
            case 11:
                Problem11 p11 = new Problem11();
                p11.solution11();
                break;
            case 12:
                Problem12 p12 = new Problem12();
                p12.solution12();
                break;
            case 13:
                Problem13 p13 = new Problem13();
                p13.solution13();
                break;
            case 14:
                Problem14 p14 = new Problem14();
                p14.solution14();
                break;
            case 15:
                Problem15 p15 = new Problem15();
                p15.solution15();
                break;
            case 16:
                Problem16 p16 = new Problem16();
                p16.solution16();
                break;
            case 17:
                Problem17 p17 = new Problem17();
                p17.solution17();
                break;
            case 18:
                Problem18 p18 = new Problem18();
                p18.solution18();
                break;
            case 19:
                Problem19 p19 = new Problem19();
                p19.solution19();
                break;
            case 20:
                Problem20 p20 = new Problem20();
                p20.solution20();
                break;
            case 31:
                Problem31 p31 = new Problem31();
                p31.solution31();
                break;
            case 37:
                Problem37 p37 = new Problem37();
                p37.solution37();
                break;
            case 40:
                Problem40 p40 = new Problem40();
                p40.solution40();
                break;
            case 41:
                Problem41 p41 = new Problem41();
                p41.solution41();
                break;
            case 42:
                Problem42 p42 = new Problem42();
                p42.solution42();
                break;
            default:
                System.err.println("Problem no " + problemNo + " is not valid.");
                break;
        }
    }
}
