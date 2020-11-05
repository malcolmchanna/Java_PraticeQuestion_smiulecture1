package com.company;

import java.util.Scanner;

public class PracticeEight {

    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, num4,num5;
        int totalNeg = 0, totalPos = 0, totalZero = 0;

        System.out.print("ENTER FIRSR INTEGER");    //1
        num1 = input.nextInt();
        System.out.print("ENTER Second INTEGER");   //2
        num2 = input.nextInt();
        System.out.print("ENTER third INTEGER");   //3
        num3 = input.nextInt();
        System.out.print("ENTER fouth INTEGER");   //4
        num4 = input.nextInt();
        System.out.print("ENTER Fiveth INTEGER");   //5
        num5 = input.nextInt();

        if (num1 < 0)
            totalNeg = totalNeg + 1;

        if (num2 < 0)
            totalNeg = totalNeg + 1;

        if (num3 < 0)
            totalNeg = totalNeg + 1;

        if (num4 < 0)
            totalNeg = totalNeg + 1;

        if (num5 < 0)
            totalNeg = totalNeg + 1;

        // if any integer input is a positive number, add 1
        if (num1 > 0)
            totalPos = totalPos + 1;

        if (num2 > 0)
            totalPos = totalPos + 1;

        if (num3 > 0)
            totalPos = totalPos + 1;

        if (num4 > 0)
            totalPos = totalPos + 1;

        if (num5 > 0)
            totalPos = totalPos + 1;

        // if any integer input is zero, add 1
        if (num1 == 0)
            totalZero = totalZero + 1;

        if (num2 == 0)
            totalZero = totalZero + 1;

        if (num3 == 0)
            totalZero = totalZero + 1;

        if (num4 == 0)
            totalZero = totalZero + 1;

        if (num5 == 0)
            totalZero = totalZero + 1;
        System.out.printf("TOTAL NEGATIVE NUMER %d\n", totalNeg);
        System.out.printf("TOTAL POSTIVE NUMER %d\n", totalPos);
        System.out.printf("TOTAL ZERO NUMER %d\n", totalZero);
    }
}
