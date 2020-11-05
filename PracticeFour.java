package com.company;

import java.util.Scanner;

public class PracticeFour {

    public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int num1 ;
            int num2 ;
            int product;
            int sum , diff , quotient;

             System.out.print("ENTER FIRSt INTEGER");
            num1 = input.nextInt();

            System.out.print("ENTER second INTEGER");
            num2 = input.nextInt();

            product = num1 * num2 ;
            System.out.printf(" product of two integer %d\n" , product);

            sum = num1 + num2 ;
            System.out.printf(" sum of two integer %d\n" , sum);

           diff = num1 - num2 ;
           System.out.printf(" diffof two integer %d\n" , diff);

        quotient = num1 / num2 ;
        System.out.printf(" quotient of two integer %d" , quotient);


    }

    }

