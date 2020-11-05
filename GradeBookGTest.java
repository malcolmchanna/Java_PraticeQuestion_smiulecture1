package com.company;

import java.util.Scanner;

public class GradeBookGTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GradeBook myGradeBook = new GradeBook();


        System.out.println("Please enter the course Name");
        String nameOfcourse = input.nextLine();

        myGradeBook.displayMessage(nameOfcourse);
        System.out.println();


    }
}
