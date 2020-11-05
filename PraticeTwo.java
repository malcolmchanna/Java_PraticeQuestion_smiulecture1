package com.company;
import java.util.Scanner;


public class PraticeTwo {

    public static  void main ( String[] args){
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("ENTER FIRST INTEGER");
        num1 = input.nextInt();

        System.out.print("ENTER SECOND INTERGER");
        num2 = input.nextInt();

        if (num1 == num2){
            System.out.printf(" %d == %d\n" , num1 ,num2);
        }
        if (num1 != num2){
            System.out.printf(" %d != %d\n" , num1 ,num2);
        }
        if (num1 < num2){
            System.out.printf(" %d < %d\n" , num1 ,num2);
        }
        if (num1 > num2){
            System.out.printf(" %d > %d\n" , num1 ,num2);
        }
        if (num1 >= num2){
            System.out.printf(" %d >= %d\n" , num1 ,num2);
        }
    }


}
