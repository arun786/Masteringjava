package com.arun.datatypes;

/**
 * Created by Adwiti on 7/15/2017.
 */
public class IntegerFloatDoube {

    public static void main(String[] args) {
        /*size of an int is 32 bits i.e 4 bytes*/
        int myInt = 5 / 3;
        /*size of a float is 32 bits i.e. 4 bytes*/
        float myFloat = 5f / 3f;
        /*size of a double is 64 bits i.e. 8 bytes*/
        double myDouble = 5d / 3d;

        System.out.println("MyInt : " + myInt);
        System.out.println("MyFloat : " + myFloat);
        System.out.println("MyDouble : " + myDouble);

        /*o/p will be

        MyInt : 1
        MyFloat : 1.6666666
        MyDouble : 1.6666666666666667*/
    }
}
