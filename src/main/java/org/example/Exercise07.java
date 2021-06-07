package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class Exercise07
{
    public static void main( String[] args )
    {
        double length, width, sqft, sqm;
        final double cfactor = .09290304;

        Scanner sc = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        length = sc.nextInt();
        System.out.print("What is the width of the room in feet? ");
        width = sc.nextInt();
        System.out.printf("You entered dimensions of %f feet by %f feet.\n", length, width );
        sqft = length * width;
        sqm = sqft * cfactor;
        System.out.printf("The area is\n%f square feet\n%f square meters", sqft, sqm);
    }
}
