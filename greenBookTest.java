package com.company;

import java.util.Scanner;

public class greenBookTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        greenBook myGreenBook1 = new greenBook(" java programming");
        greenBook myGreenBook2 = new greenBook(" c Language programming");

         myGreenBook1.displayMessage();
         myGreenBook2.displayMessage();
    }

}

