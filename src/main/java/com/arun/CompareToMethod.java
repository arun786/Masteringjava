package com.arun;

/**
 * Created by Adwiti on 7/24/2017.
 */
public class CompareToMethod {
    public static void main(String[] args) {
        String str = "computer";
        String str1 = "comparision";


        /*compareTo checks the strings are lexicographically similar which means which word comes in the dictionary first*/
        int i = str.compareTo(str1);
        System.out.println(i);  //20

        System.out.println(str1.compareTo(str)); //-20

        /*which means if the output is negative, we will have the first argument which is compared to the second argument comes first in dictionary*/
    }
}
