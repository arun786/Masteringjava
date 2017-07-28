package com.arun.challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Adwiti on 7/28/2017.
 */
public class Challenge2 {

    public static void main(String[] args) {
        int[][] range = new int[2][2];
        range[0][0] = 1;
        range[0][1] = 4;
        range[1][0] = 0;
        range[1][1] = 1;

        List<Integer> numbers = Arrays.asList(2, 1, 2, 3, 4);
        int c = sumofArray(numbers, range);
    }


    public static int sumofArray(List<Integer> numbers, int[][] range) {
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Numbers in order " + numbers);
        int sum = 0;
        for (int i = 0; i < range.length; i++) {
            int firstIndex = 0;
            int secondIndex = 0;
            for (int j = 0; j < range[1].length; j++) {
                if (j == 0) {
                    firstIndex = range[i][j];
                    System.out.print("Index of " + firstIndex + ",");
                } else {
                    secondIndex = range[i][j];
                    System.out.print(secondIndex);
                    for (int k = firstIndex; k <= secondIndex; k++) {
                        sum = sum + numbers.get(k);
                    }
                    System.out.println(" = sum : " + sum);
                }
            }
        }
        System.out.println("sum = " + sum);
        return sum;
    }
}
