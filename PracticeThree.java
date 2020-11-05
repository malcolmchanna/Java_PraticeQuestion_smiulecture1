package com.company;

import java.util.Scanner;
public class PracticeThree {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num1 , num2 , num3;
        int product;

        System.out.print("ENTER FIRSt INTEGER");
        num1 = input.nextInt();

        System.out.print("ENTER second INTEGER");
        num2 = input.nextInt();

        System.out.print("ENTER thrid INTEGER");
        num3 = input.nextInt();

        product = num1 * num2 * num3;

        System.out.printf(" product of three integer %d" , product);
    }

}
