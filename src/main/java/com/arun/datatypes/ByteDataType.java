package com.arun.datatypes;

/**
 * Created by Adwiti on 7/8/2017.
 */
public class ByteDataType {
    public static void main(String[] args) {
        /*Byte data type has a width of 8 bits*/
        byte myByteMinValue = -127;
        byte myByteMaxValue = +127;
        System.out.println(myByteMinValue);
        System.out.println(myByteMaxValue);

        int myNewByteMinValue = myByteMinValue/2;
        System.out.println(myNewByteMinValue);

        int myNewByteMaxValue = myByteMaxValue/2;
        System.out.println(myNewByteMaxValue);

    }
}
