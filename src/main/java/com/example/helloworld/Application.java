package com.example.helloworld;
import com.example.helloworld.promlems.*;

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
            case 21:
                Problem21 p21 = new Problem21();
                p21.solution21();
                break;
            case 22:
                Problem22 p22 = new Problem22();
                p22.solution22();
                break;
            case 23:
                Problem23 p23 = new Problem23();
                p23.solution23();
                break;
            case 24:
                Problem24 p24 = new Problem24();
                p24.solution24();
                break;
            case 25:
                Problem25 p25 = new Problem25();
                p25.solution25();
                break;
            case 26:
                Problem26 p26 = new Problem26();
                p26.solution();
                break;
            case 27:
                Problem27 p27 = new Problem27();
                p27.solution();
                break;
            case 28:
                Problem28 p28 = new Problem28();
                p28.solution();
                break;
            case 29:
                Problem29 p29 = new Problem29();
                p29.solution();
                break;
            case 30:
                Problem30 p30 = new Problem30();
                p30.solution30();
                break;
            case 31:
                Problem31 p31 = new Problem31();
                p31.solution31();
                break;
            case 32:
                Problem32 p32 = new Problem32();
                p32.solution32();
                break;
            case 33:
                Problem33 p33 = new Problem33();
                p33.solution();
                break;
            case 34:
                Problem34 p34 = new Problem34();
                p34.solution();
                break;
            case 35:
                Problem35 p35 = new Problem35();
                p35.solution();
                break;
            case 36:
                Problem36 p36 = new Problem36();
                p36.solution();
                break;
            case 37:
                Problem37 p37 = new Problem37();
                p37.solution37();
                break;
            case 38:
                Problem38 p38 = new Problem38();
                p38.solution();
                break;
            case 39:
                Problem39 p39 = new Problem39();
                p39.solution();
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
                p42.solution();
                break;
            default:
                System.err.println("Problem no " + problemNo + " is not valid.");
                break;
        }
    }
}
