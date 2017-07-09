package com.arun.datatypes;

/**
 * Created by Adwiti on 7/8/2017.
 */
public class IntDatatype {
    public static void main(String[] args) {

        /*int data type has a width of 32 bits*/
        int myMinValue = -2_14_74_83_647;
        int myMaxValue = +2147483647;
        System.out.println(myMinValue);
        System.out.println(myMaxValue);

        int newmyMaxValue = myMaxValue/2;
        System.out.println(newmyMaxValue);

        long myNewMinValue = myMinValue/2;
        System.out.println(myNewMinValue);

    }
}
