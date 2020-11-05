package com.company;
 import java.util.Scanner;

public class RedBookTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        RedBook myRedBook = new RedBook();

        System.out.printf(" inital value of course is \n %s \n", myRedBook.getCourseName()) ;
        String name2 = input.nextLine();

        System.out.println("Please enter the value");
        String theName = input.nextLine();
        myRedBook.setCourseName(theName);
        System.out.println();
        System.out.println();
        myRedBook.displayMessage();
    }




}

