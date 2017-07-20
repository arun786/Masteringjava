package com.arun.LambdaExpressions;

import java.util.function.Supplier;

/**
 * Created by Adwiti on 7/19/2017.
 */
public class UseOfSupplier_1 {
    public static void main(String[] args) {
        Supplier<String> i = () -> "Hello World";
        System.out.println(i.get());
    }
}
