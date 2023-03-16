package com.example.helloworld;

import com.example.helloworld.problems.*;

public class ProblemGenerator
{
    public static Problem createProblem(int problemNo) throws Exception
    {
        Problem p;
        switch (problemNo)
        {
            case 1:
                p = new Problem1();
                break;
            case 2:
                p = new Problem2();
                break;
            case 3:
                p = new Problem3();
                break;
            case 4:
                p = new Problem4();
                break;
            case 5:
                p = new Problem5();
                break;
            case 6:
                p = new Problem6();
                break;
            case 7:
                p = new Problem7();
                break;
            case 8:
                p = new Problem8();
                break;
            case 9:
                p = new Problem9();
                break;
            case 10:
                p = new Problem10();
                break;
            case 11:
                p = new Problem11();
                break;
            case 12:
                p = new Problem12();
                break;
            case 13:
                p = new Problem13();
                break;
            case 14:
                p = new Problem14();
                break;
            case 15:
                p = new Problem15();
                break;
            case 16:
                p = new Problem16();
                break;
            case 17:
                p = new Problem17();
                break;
            case 18:
                p = new Problem18();
                break;
            case 19:
                p = new Problem19();
                break;
            case 20:
                p = new Problem20();
                break;
            case 21:
                p = new Problem21();
                break;
            case 22:
                p = new Problem22();
                break;
            case 23:
                p = new Problem23();
                break;
            case 24:
                p = new Problem24();
                break;
            case 25:
                p = new Problem25();
                break;
            case 26:
                p = new Problem26();
                break;
            case 27:
                p = new Problem27();
                break;
            case 28:
                p = new Problem28();
                break;
            case 29:
                p = new Problem29();
                break;
            case 30:
                p = new Problem30();
                break;
            case 31:
                p = new Problem31();
                break;
            case 32:
                p = new Problem32();
                break;
            case 33:
                p = new Problem33();
                break;
            case 34:
                p = new Problem34();
                break;
            case 35:
                p = new Problem35();
                break;
            case 36:
                p = new Problem36();
                break;
            case 37:
                p = new Problem37();
                break;
            case 38:
                p = new Problem38();
                break;
            case 39:
                p = new Problem39();
                break;
            case 40:
                p = new Problem40();
                break;
            case 41:
                p = new Problem41();
                break;
            case 42:
                p = new Problem42();
                break;
            case 43:
                p = new Problem43();
                break;
            case 44:
                p = new Problem44();
                break;
            case 45:
                p = new Problem45();
                break;
            case 46:
                p = new Problem46();
                break;
            case 47:
                p = new Problem47();
                break;
            case 48:
                p = new Problem48();
                break;
            case 49:
                p = new Problem49();
                break;
            case 50:
                p = new Problem50();
                break;
            case 51:
                p = new Problem51();
                break;
            case 217:
                p = new Problem217();
                break;
            //case 242:
                //p = new Problem242();
                //break;
            //case 1111:
                //p = new Problem1111();
                //break;
            case 499:
                p = new Problem499();
                break;
            default:
                throw new Exception("Problem no " + problemNo + " is not valid.");
        }

        return p;
    }
}
