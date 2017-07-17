package com.arun.LambdaExpressions;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Created by Adwiti on 7/16/2017.
 */
public class UseOfSupplier {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(100);
            System.out.print(number + ",");
        }

        System.out.println();

        System.out.println("****use Of Supplier****");
        Supplier<Integer> randomSupplier = () -> random.nextInt(10);
        for (int i = 0; i < 10; i++) {
            System.out.print(randomSupplier.get() + ",");
        }
    }
}
