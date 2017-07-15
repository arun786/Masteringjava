package com.arun.challenge;

import java.util.Scanner;

/**
 * Created by Adwiti on 7/15/2017.
 */
public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter weights in pound .." );
        double weightInPounds = scan.nextDouble();

        double wieghtInKilogram = weightInPounds * 0.45359237d;
        System.out.println("Weight in Kilograms " + wieghtInKilogram);
    }
}
